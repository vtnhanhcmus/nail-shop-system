package com.nail.shop.services.impls;

import com.nail.shop.mappers.OwnerEmployeeMapper;
import com.nail.shop.mappers.UserMapper;
import com.nail.shop.models.OwnerEmployees;
import com.nail.shop.models.UserNail;
import com.nail.shop.rest.dto.EmployeeSignUpRequest;
import com.nail.shop.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;


@Service
@Transactional(rollbackFor = Exception.class)
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private OwnerEmployeeMapper ownerEmployeeMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public void save(EmployeeSignUpRequest employeeSignUpRequest) {
        employeeSignUpRequest.getOwnerEmployeeRequests().stream().forEach(employee -> {
            UserNail owner = userMapper.findByUserId(employee.getOwnerId());
            UserNail user = userMapper.findByUserId(employee.getEmployeeId());

            if(Objects.isNull(owner) || Objects.isNull(user)){
                throw new RuntimeException("Not valid owner or user");
            }

            OwnerEmployees ownerEmployee = OwnerEmployees.builder().ownerId(owner.getId()).employeeId(user.getId()).build();
            OwnerEmployees ownerEmp = ownerEmployeeMapper.findByOwnerIdAndEmployeeId(owner.getId().toString(), user.getId().toString());

            if (Objects.isNull(ownerEmp)){
                ownerEmployeeMapper.insert(ownerEmployee);
            }else{
                ownerEmployeeMapper.update(ownerEmployee);
            }
        });
    }
}
