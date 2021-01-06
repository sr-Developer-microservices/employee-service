package com.employeemanagement.rohit.repository.mapper;


import com.employeemanagement.rohit.model.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet rs, int i) throws SQLException {
        Employee employee = new Employee();
        employee.setEmployeeId(rs.getInt("employee_id"));
        employee.setName(rs.getString("name"));
        employee.setJobId(rs.getLong("job_id"));
        employee.setSalary(rs.getInt("salary"));
        employee.setDepartmentId(rs.getLong("department_id"));
        return employee;
    }
}
