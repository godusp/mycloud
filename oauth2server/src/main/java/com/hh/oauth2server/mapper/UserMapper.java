package com.hh.oauth2server.mapper;

import com.hh.oauth2server.dto.AppUser;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select * from app_user where username = #{username}")
    AppUser selectUserByUsername(String username);
}
