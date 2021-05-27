package JavaKamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import JavaKamp.hrms.business.abstracts.SystemEmployeeService;
import JavaKamp.hrms.core.utilities.results.DataResult;
import JavaKamp.hrms.entities.concretes.SystemEmployee;
@RestController
@RequestMapping("/api/systememployees")
public class SystemEmployeesController {
	
	private SystemEmployeeService systemEmployeeService;
	@Autowired
	public SystemEmployeesController(SystemEmployeeService systemEmployeeService) {
		super();
		this.systemEmployeeService = systemEmployeeService;
	}
	@GetMapping("/getall")
	public DataResult<List<SystemEmployee>> getAll(){
		return systemEmployeeService.getAll();
	}

}
