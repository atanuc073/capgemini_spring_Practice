package com.cg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import com.cg.dao.IDeptDao;
import com.cg.dao.IEmpDao;
import com.cg.dto.EmpDto;
import com.cg.entity.Dept;
import com.cg.entity.Emp;
import com.cg.exceptions.DeptException;
import com.cg.service.EmpServiceImpl;
import com.cg.service.IEmpService;

@SpringBootTest
public class TestAddEmployee {
	@Mock
	private IEmpDao empdao;
	
	@Mock
	private IDeptDao deptdao;
	@InjectMocks
	private IEmpService service = new EmpServiceImpl();
	@BeforeEach
	public void beforeEach() {
		when(deptdao.findByDeptName("hr")).thenReturn(new Dept());
		when(deptdao.findByDeptName("aaa")).thenReturn(null);
		Emp persistedEmp = new Emp(1001,"ratan",42000.0,LocalDate.of(2015, 05, 15));
		
		when(empdao.save(new Emp(persistedEmp))).thenReturn(persistedEmp);
	}
	@Test
	@DisplayName(value = "Test add employee for dept hr")
	public void testAddEmployee1() throws DeptException {
		EmpDto empdto =new EmpDto(1001,"tanmoy",45000.0,LocalDate.of(2012, 04, 14),"hr");
//		assertTrue(service.addEmployee(empdto)==1001);
		assertNotNull(service.addEmployee(empdto));
	}
	
	@Test
	@DisplayName(value = "Test add employee for dept aaa")
	public void testAddEmployee2() throws DeptException {
		EmpDto empdto =new EmpDto("tanmoy",45000.0,LocalDate.of(2012, 04, 14),"aaa");
		assertThrows(DeptException.class, ()->service.addEmployee(empdto));
		
	}
}
