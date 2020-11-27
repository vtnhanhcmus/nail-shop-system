package com.nail.shop.mappers;

import com.nail.shop.models.Companies;
import com.nail.shop.models.Shops;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CompanyMapper {
    void insert(@Param("company") Companies company);
    void update(@Param("company") Companies company);
    Companies findByCompanyId(@Param("companyId") String companyId);
}
