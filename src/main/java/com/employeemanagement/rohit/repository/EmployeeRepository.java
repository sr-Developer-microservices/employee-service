package com.employeemanagement.rohit.repository;

import com.employeemanagement.rohit.dto.EmployeeResponseDto;
import com.employeemanagement.rohit.model.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> getAllEmployee();

    void addEmployee(Employee employee);

    void deleteEmployee(int id);

    Employee findByEmployeeId(Long id);
}
