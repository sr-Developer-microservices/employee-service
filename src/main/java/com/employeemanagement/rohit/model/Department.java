package com.employeemanagement.rohit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Rohit Khadse
 * @created : 2021-01-05 , 19:18
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    private Long departmentId;
    private String departmenName;
    private String departmentAddress;
    private String departmentCode;
}
