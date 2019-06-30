package com.example.demo.mapper;

import com.example.demo.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author MW
 */
@Mapper
public interface MemberMapper {

    MemberDTO getMember();

    MemberDTO getMemberForLogin(String email);

}
