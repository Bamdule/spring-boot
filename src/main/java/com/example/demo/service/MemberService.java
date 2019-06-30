package com.example.demo.service;

import com.example.demo.dto.MemberDTO;

/**
 *
 * @author MW
 */
public interface MemberService {

    MemberDTO getMember();
    
    MemberDTO getMemberForLogin(String email);
}
