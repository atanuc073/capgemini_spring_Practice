package com.cg.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dto.EmpDto;
import com.cg.dto.SuccessMessage;
import com.cg.entity.Emp;
import com.cg.exceptions.DeptException;
import com.cg.exceptions.EmpNotFoundException;
import com.cg.exceptions.ValidateEmpException;
import com.cg.service.IEmpService;

@RestController
public class EmpCrudService {
	@Autowired
	private IEmpService service;

//	@PostMapping("addemployee")
	@RequestMapping(value="addemployee",method=RequestMethod.POST)
	public SuccessMessage addEmployee(@Valid @RequestBody EmpDto empdto,BindingResult br) throws DeptException, ValidateEmpException {
		
		if(br.hasErrors())
			throw new ValidateEmpException(br.getFieldErrors());
		int  eid =service.addEmployee(empdto);
		return new SuccessMessage("Your Generated Id is"+eid);
	}


	

}
