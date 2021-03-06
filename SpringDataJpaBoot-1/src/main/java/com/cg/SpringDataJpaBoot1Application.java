package com.cg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.dto.AccountDto;
import com.cg.service.IAccountService;

@SpringBootApplication
public class SpringDataJpaBoot1Application implements CommandLineRunner{
	@Autowired
	private IAccountService accservice;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaBoot1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		AccountDto account1 =new AccountDto("itachi",50000.0);
		
		/*accservice.addAccount(account1);
		Integer res1 =accservice.addAccount(account1);
		System.out.println("Account Created res1");
		AccountDto account2 = new AccountDto("madara", 60000.0);
		Integer res2 =accservice.addAccount(account2);*/
		
		System.out.println(accservice.getAccount(1));
		System.out.println(accservice.getAccount(3));
		System.out.println("after Transferring");
		boolean res = accservice.transferFund(1, 3, 10000.0);
		System.out.println(accservice.getAccount(1));
		System.out.println(accservice.getAccount(3));
	}

}
