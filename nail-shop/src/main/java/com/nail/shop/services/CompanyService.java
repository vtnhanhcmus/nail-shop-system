package com.nail.shop.services;

import com.nail.shop.models.Companies;
import com.nail.shop.rest.dto.CompanySignUpRequest;

import java.util.List;
import java.util.Optional;


public interface CompanyService {
    void insert(CompanySignUpRequest companySignUpRequest);
    void update(CompanySignUpRequest companySignUpRequest, String companyId);
    void delete(String companyId);
    Optional<Companies> findById(String companyId);
    List<Companies> findAllCompany();
}
