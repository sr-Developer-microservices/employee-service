package com.employeemanagement.rohit.util;

import com.employeemanagement.rohit.exception.ValidationException;
import org.apache.commons.lang3.StringUtils;

public class EmployeeValidationHelper {

    public EmployeeValidationHelper() {
        super();
    }

    public static EmployeeValidationHelper newInstance() {
        return new EmployeeValidationHelper();
    }

    public void validateName(String name) throws ValidationException {
        if (StringUtils.isBlank(name)){
            throw new ValidationException("Employee name is blank or empty");
        }
    }
}
