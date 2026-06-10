package com.msedcl.main.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.msedcl.main.dto.EmployeeDTO;

public class EmployeeService {
	private List<EmployeeDTO> employeeList = new ArrayList<>();
	EmployeeDTO E1 = new EmployeeDTO(1,"Ramesh",1000);
	EmployeeDTO E2 = new EmployeeDTO(1,"Suresh",1000);
	EmployeeDTO E3 = new EmployeeDTO(1,"Ganesh",1000);
public EmployeeService() {
	employeeList.add(E1);
	employeeList.add(E2);
	employeeList.add(E3);
}

}
