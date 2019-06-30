package com.example.demo.auth;

import com.example.demo.dto.MemberDTO;
import com.example.demo.service.MemberService;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

/**
 *
 * @author MW
 */
@Component
public class AuthProvider implements AuthenticationProvider {

    @Autowired
    private MemberService memberService;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public Authentication authenticate(Authentication a) throws AuthenticationException {
        String id = a.getName();
        String password = a.getCredentials().toString();

        logger.debug("[MYTEST] id : {}, password : {}", id, password);

        MemberDTO memberDTO = memberService.getMemberForLogin(id);

        if (Objects.isNull(memberDTO) || !memberDTO.getPassword().equals(password)) {
            logger.debug("[MYTEST] Login Failed");
            return null;
        }
        List<GrantedAuthority> grantedAuthoritys = new ArrayList<>();
        grantedAuthoritys.add(new SimpleGrantedAuthority("ROLE_USER"));

        AuthUser authUser = new AuthUser(id, password, grantedAuthoritys, memberDTO);

        return authUser;

    }

    @Override
    public boolean supports(Class<?> type) {
        return type.equals(UsernamePasswordAuthenticationToken.class);
    }

}
