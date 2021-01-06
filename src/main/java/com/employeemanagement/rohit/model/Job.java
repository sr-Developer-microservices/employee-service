package com.employeemanagement.rohit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Rohit Khadse
 * @created : 2021-01-05 , 19:13
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Job {
    private Long jobId;
    private String jobTitle;
    private Double minSalary;
    private Double maxSalary;
}
