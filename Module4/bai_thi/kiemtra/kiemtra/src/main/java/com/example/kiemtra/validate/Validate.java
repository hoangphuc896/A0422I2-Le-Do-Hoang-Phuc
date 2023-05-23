package com.example.kiemtra.validate;

import com.example.kiemtra.entity.DuAn;
import com.example.kiemtra.service.DuAnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class Validate implements Validator {
    @Autowired
    DuAnService duAnService;

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        if (!(target instanceof DuAn)) {
            return;
        }
        DuAn duAn = (DuAn) target;
        if (duAnService.findById(duAn.getMaDuAn()) != null) {
            errors.rejectValue("maDuAn", "create.duplicateId", new String[]{duAn.getMaDuAn()},"maDuAn bị trùng lặp");
        }

    }
}
