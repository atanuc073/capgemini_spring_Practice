package com.cg;

import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.dao.IEmpDao;
import com.cg.entity.Emp;
import com.cg.exceptions.EmpNotFoundException;
import com.cg.service.EmpServiceImpl;
import com.cg.service.IEmpService;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class TestviewByDept {
	@Mock
	private IEmpDao empdao;
	@InjectMocks
	private IEmpService service=new EmpServiceImpl();
	@BeforeEach
	public void beforeEach() {
		List<Emp> lst =new ArrayList<>();
		lst.add(new Emp(1001,"jatin",54000.0,LocalDate.of(2016, 06, 16)));
		lst.add(new Emp(1002,"ratan",64000.0,LocalDate.of(2017, 04, 26)));
		lst.add(new Emp());
		List<Emp> lst2 = new ArrayList<>();
		when(empdao.viewEmployee("hr")).thenReturn(lst);
		when(empdao.viewEmployee("aaa")).thenReturn(lst2);
	}
	@Test
	@DisplayName(value="testviewbydept for hr")
	public void testviewByDept1() throws EmpNotFoundException {
		assertTrue(service.viewEmployee("hr").size()>0);
		
	}
	@Test
	@DisplayName(value="testviewbydept for aaa")
	public void testviewByDept2() throws EmpNotFoundException {
//		assertTrue(service.viewEmployee("hr").size()>0);
		assertThrows(EmpNotFoundException.class, ()->service.viewEmployee("aaa"));
	}
}
