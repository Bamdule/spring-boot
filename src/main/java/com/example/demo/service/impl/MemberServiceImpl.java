package com.example.demo.service.impl;

import com.example.demo.dto.MemberDTO;
import com.example.demo.mapper.MemberMapper;
import com.example.demo.service.MemberService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MW
 */
@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public MemberDTO getMember() {
        return memberMapper.getMember();
    }

    @Override
    public MemberDTO getMemberForLogin(String email) {
        return memberMapper.getMemberForLogin(email);
    }

}
