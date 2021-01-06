package com.employeemanagement.rohit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private int employeeId;
    private String name;
    private int salary;
    private Long jobId;
    private Long departmentId;
}
