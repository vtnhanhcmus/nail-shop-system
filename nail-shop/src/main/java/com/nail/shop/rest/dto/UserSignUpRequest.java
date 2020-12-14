package com.nail.shop.rest.dto;
import com.nail.shop.anotations.EmailConstraint;
import com.nail.shop.anotations.FieldsValueMatch;
import com.nail.shop.models.Gender;
import lombok.Data;

import java.util.List;


@Data
@FieldsValueMatch.List({
        @FieldsValueMatch(
                field = "password",
                fieldMatch = "verifyPassword",
                message = "Passwords do not match!"
        ),
        @FieldsValueMatch(
                field = "email",
                fieldMatch = "verifyEmail",
                message = "Email addresses do not match!"
        )
})
public class UserSignUpRequest {
    private Gender sex;
    private String firstName;
    private String lastName;
    @EmailConstraint
    private String email;
    @EmailConstraint
    private String verifyEmail;
    private List<String> roles;
    private String password;
    private String verifyPassword;
    private String jwtToken;
}
