package com.nail.shop.rest;

import com.nail.shop.rest.dto.CompanySignUpRequest;
import com.nail.shop.services.CompanyService;
import com.nail.shop.services.impls.SystemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("companies")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @Autowired
    private SystemServiceImpl systemService;

    @PostMapping("/register")
    public ResponseEntity signUp(@RequestBody CompanySignUpRequest companySignUpRequest){
        companyService.insert(companySignUpRequest);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/{companyId}/update")
    public ResponseEntity update(@RequestBody CompanySignUpRequest companySignUpRequest, @PathVariable("companyId")String companyId){
        companyService.update(companySignUpRequest, companyId);
        return ResponseEntity.ok().build();
    }

}
