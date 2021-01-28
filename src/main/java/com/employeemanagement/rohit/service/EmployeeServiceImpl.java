package com.employeemanagement.rohit.service;

import com.employeemanagement.rohit.dto.EmployeeResponseDto;
import com.employeemanagement.rohit.model.Department;
import com.employeemanagement.rohit.model.Employee;
import com.employeemanagement.rohit.model.Job;
import com.employeemanagement.rohit.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.getAllEmployee();
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeRepository.addEmployee(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteEmployee(id);
    }

    @Override
    public EmployeeResponseDto getEmployeeWithDepartmentNJob(Long id) {
        EmployeeResponseDto dto = new EmployeeResponseDto();
        Employee employee = employeeRepository.findByEmployeeId(id);
        dto.setEmployee(employee);
        Department department = restTemplate.getForObject("http://localhost:7000/departments/" + employee.getDepartmentId(),Department.class);
        dto.setDepartment(department);
        Job job = restTemplate.getForObject("http://localhost:8000/jobs/"+ employee.getJobId(),Job.class);
        dto.setJob(job);
        return dto;
//        return employeeRepository.getEmployeeWithDepartmentNJob(id);
    }
}
