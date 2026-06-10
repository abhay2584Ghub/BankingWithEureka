package com.msedcl.main.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.msedcl.main.dto.DepartmentDTO;

@Service
public class DepartmentService {
	private List<DepartmentDTO> departmentList= new ArrayList<>();
	DepartmentDTO D1 = new DepartmentDTO(1, "IT");
	DepartmentDTO D2 = new DepartmentDTO(2, "Account");
	DepartmentDTO D3 = new DepartmentDTO(2, "Technical");
	DepartmentDTO departmentDTO;
	
	public DepartmentService() {
		departmentList.add(D1);
		departmentList.add(D2);
		departmentList.add(D3);
	}
	
	public DepartmentService(int departmentId, String departmentName) {
				
	}
}
