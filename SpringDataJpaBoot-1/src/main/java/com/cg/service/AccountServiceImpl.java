package com.cg.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.IAccountDao;
import com.cg.dto.AccountDto;
import com.cg.entity.Account;
import com.cg.exceptions.AccountException;
import com.cg.exceptions.BalanceException;

@Service("myser")
public class AccountServiceImpl implements IAccountService{
	@Autowired
	private IAccountDao accountdao;
	@Override
	@Transactional
	public Integer addAccount(AccountDto dto) throws BalanceException {
		// TODO Auto-generated method stub
		if(dto.getBalance()<=0) {
			throw new BalanceException("Balance Must be Minimum 1");
		}
		Account account = new Account();
		account.setCustName(dto.getCustomerName());
		account.setBalance(dto.getBalance());
		
		Account savedaccount = accountdao.save(account);
		return savedaccount.getAccountId();
	}

	@Override
	public Account getAccount(int aid) throws AccountException {
		// TODO Auto-generated method stub
		Optional<Account> optaccount = accountdao.findById(aid);
		if(!optaccount.isPresent())
			throw new AccountException("Account Not exists for "+aid);
		
		return optaccount.get();
	}

	@Override
	@Transactional
	public boolean transferFund(int fromaid, int toaid, double amount) throws AccountException, BalanceException {
		// TODO Auto-generated method stub
		Account from = getAccount(fromaid);
		Account to = getAccount(toaid);
		if(from.getBalance()<amount)
			throw new BalanceException("Not Sufficient Balance");
		from.setBalance(from.getBalance()-amount);
		to.setBalance(to.getBalance()+amount);
		accountdao.save(from);
		accountdao.save(to);
		return true;
	}

}
