package com.employeemanagement.rohit.service;

import com.employeemanagement.rohit.dto.EmployeeResponseDto;
import com.employeemanagement.rohit.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployee();

    void addEmployee(Employee employee);

    void deleteEmployee(int id);

    EmployeeResponseDto getEmployeeWithDepartmentNJob(Long id);

}
