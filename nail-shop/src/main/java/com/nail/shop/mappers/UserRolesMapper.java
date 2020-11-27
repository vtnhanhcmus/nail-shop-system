package com.nail.shop.mappers;

import com.nail.shop.models.UserRoles;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserRolesMapper {
    void insert(@Param("role") UserRoles roles);
    UserRoles update(@Param("role") String role, @Param("userId") String userId);
}
