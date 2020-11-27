package com.nail.shop.services.impls;

import com.nail.shop.mappers.CompanyMapper;
import com.nail.shop.mappers.UserMapper;
import com.nail.shop.models.Companies;
import com.nail.shop.models.UserNail;
import com.nail.shop.rest.dto.CompanySignUpRequest;
import com.nail.shop.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyMapper companyMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private SystemServiceImpl systemService;

    @Override
    public void insert(CompanySignUpRequest companySignUpRequest) {
        Optional<UserNail> userNail = systemService.fetchCurrentUser();
        Companies company = Companies.builder()
                .description(companySignUpRequest.getDescription())
                .name(companySignUpRequest.getCompanyName())
                .imagePath(companySignUpRequest.getImagePath())
                .ownerId(userNail.get().getId())
                .build();
        companyMapper.insert(company);
    }

    @Override
    public void update(CompanySignUpRequest companySignUpRequest, String companyId) {
        Optional<UserNail> userNail = systemService.fetchCurrentUser();
        Companies company = companyMapper.findByCompanyId(companyId);
        if (Objects.isNull(company)){
            throw new RuntimeException("Company does not valid");
        }
        company.setDescription(companySignUpRequest.getDescription());
        company.setImagePath(companySignUpRequest.getImagePath());
        company.setOwnerId(userNail.get().getId());
        companyMapper.update(company);
    }

    @Override
    public void delete(String companyId) {

    }

    @Override
    public Optional<Companies> findById(String companyId) {
        return Optional.empty();
    }

    @Override
    public List<Companies> findAllCompany() {
        return null;
    }
}
