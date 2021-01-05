package com.employeemanagement.rohit.repository;

import com.employeemanagement.rohit.model.Employee;
import com.employeemanagement.rohit.repository.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String SELECT_ALL_EMPLOYEE = "select * from employee";

    private static final String ADD_EMPLOYEE = "INSERT INTO EMPLOYEE(name,job_id,salary) values (?,?,?)";

    private static final String DELETE_EMPLOYEE = "DELETE FROM EMPLOYEE WHERE employee_id = ?";

    @Override
    public List<Employee> getAllEmployee() {
        return jdbcTemplate.query(SELECT_ALL_EMPLOYEE, new EmployeeMapper());
    }

    @Override
    public void addEmployee(Employee employee) {
        jdbcTemplate.update(ADD_EMPLOYEE,employee.getName(),employee.getJobId(),employee.getSalary());
    }

    @Override
    public void deleteEmployee(int id) {
        jdbcTemplate.update(DELETE_EMPLOYEE,id);
    }
}
