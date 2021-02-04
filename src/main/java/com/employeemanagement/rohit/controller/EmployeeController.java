package com.employeemanagement.rohit.controller;

import com.employeemanagement.rohit.dto.EmployeeResponseDto;
import com.employeemanagement.rohit.exception.ValidationException;
import com.employeemanagement.rohit.model.Employee;
import com.employeemanagement.rohit.service.EmployeeService;
import com.employeemanagement.rohit.util.EmployeeValidationHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class EmployeeController {

    private EmployeeValidationHelper employeeValidationHelper = EmployeeValidationHelper.newInstance();

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/getAllEmployee")
    public List<EmployeeResponseDto> getAllEmployee() {
        List<EmployeeResponseDto> employeeResponseDtoList = new ArrayList<>();

       List<Employee> employeeList = employeeService.getAllEmployee();

       for (Employee employee : employeeList){
           EmployeeResponseDto employeeResponseDto = new EmployeeResponseDto();
           employeeResponseDto.setEmployee(employee);
           employeeResponseDtoList.add(employeeResponseDto);
       }

        return employeeResponseDtoList;
    }

    @GetMapping(value = "/getEmployee/{id}")
    public EmployeeResponseDto getEmployeeWithDepartmentNJob(@PathVariable Long id){
        return employeeService.getEmployeeWithDepartmentNJob(id);
    }

    @PostMapping(value = "/addEmployee")
    public ResponseEntity<Object> addEmployee(@RequestBody Employee employee) throws ValidationException {
        try {
            employeeValidationHelper.validateName(employee.getClass().getName());
        }
        catch (ValidationException exception){
            return ResponseEntity.badRequest().body(exception.getMessage());
        }

        employeeService.addEmployee(employee);

        return ResponseEntity.ok().body("Employee Added");
    }

    @DeleteMapping(value = "/deleteEmployee/{id}")
    public void deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
    }
}
