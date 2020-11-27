package com.nail.shop.rest;

import com.nail.shop.rest.dto.EmployeeSignUpRequest;
import com.nail.shop.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/register")
    public ResponseEntity signUp(@RequestBody EmployeeSignUpRequest employeeSignUpRequest){
        employeeService.save(employeeSignUpRequest);
        return ResponseEntity.ok().build();
    }

}
