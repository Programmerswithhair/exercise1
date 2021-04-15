package com.qy28.sm.entity;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Employee {

  private Long employeeId;
  private String employeeName;
  private String employeeImg;
  private String employeeEmail;
  private String employeeDept;

  private LocalDateTime employeeTime;


}
