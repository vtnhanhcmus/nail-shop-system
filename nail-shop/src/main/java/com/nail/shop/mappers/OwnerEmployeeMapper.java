package com.nail.shop.mappers;

import com.nail.shop.models.OwnerEmployees;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OwnerEmployeeMapper {
    void insert(@Param("employee") OwnerEmployees ownerEmployee);
    void update(@Param("employee") OwnerEmployees ownerEmployee);
    OwnerEmployees findByOwnerIdAndEmployeeId(@Param("ownerId") String ownerId, @Param("employeeId") String employeeId);
}
