package com.nail.shop.mappers;

import com.nail.shop.models.UserNail;
import com.nail.shop.rest.dto.PasswordRequest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface UserMapper {
    void insert(@Param("userNail") UserNail userNail);
    void updatePassword(@Param("passwordRequest") PasswordRequest passwordRequest);
    void delete(@Param("userId") String userId);
    UserNail findByEmail(@Param("email") String email);
    UserNail findByUserId(@Param("userId") String userId);
}
