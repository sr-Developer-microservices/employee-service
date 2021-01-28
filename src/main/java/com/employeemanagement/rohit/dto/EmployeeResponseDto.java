package com.employeemanagement.rohit.dto;

import com.employeemanagement.rohit.model.Department;
import com.employeemanagement.rohit.model.Employee;
import com.employeemanagement.rohit.model.Job;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Rohit Khadse
 * @created : 2021-01-05 , 19:10
 **/

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponseDto {
    private Employee employee;
    private Job job;
    private Department department;

}
