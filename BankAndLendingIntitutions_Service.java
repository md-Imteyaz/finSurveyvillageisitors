package com.Villagevisitors.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Villagevisitors.Repository.BankAndLendingIntitutions_repo;
import com.Villagevisitors.model.BankAndLendingIntitutions;

@Service
public class BankAndLendingIntitutions_Service {
	@Autowired
	private BankAndLendingIntitutions_repo bankandlendingintitutions_repo;

	public void save(BankAndLendingIntitutions bankandlendingintitutions) {
		bankandlendingintitutions_repo.save(bankandlendingintitutions);
	}

}
