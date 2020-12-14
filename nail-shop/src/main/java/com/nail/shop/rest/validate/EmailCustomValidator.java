package com.nail.shop.rest.validate;

import com.nail.shop.anotations.EmailConstraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailCustomValidator implements ConstraintValidator<EmailConstraint, String> {

    @Override
    public void initialize(EmailConstraint emailConstraint) {
    }

    @Override
    public boolean isValid(String emailField,
                           ConstraintValidatorContext cxt) {
        return emailField != null && emailField.matches("[a-zA-Z0-9-.]+@[a-zA-Z-]+\\.(com|edu|net)+");
    }

}
