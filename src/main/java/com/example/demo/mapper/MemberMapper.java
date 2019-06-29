package com.example.demo.mapper;

import com.example.demo.dto.MemberDTO;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author MW
 */
@Mapper
public interface MemberMapper {

    MemberDTO getMember();

}
