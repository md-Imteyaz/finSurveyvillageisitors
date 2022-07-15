package com.Villagevisitors.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Villagevisitors.model.BankAndLendingIntitutions;
import com.Villagevisitors.service.BankAndLendingIntitutions_Service;

@RestController
public class BankAndLendingIntitutions_Controller {
	@Autowired
	private BankAndLendingIntitutions_Service bankandlendingintitutions_service;

	@PostMapping("/createBankAndLendingIntitutions")
	public ResponseEntity<BankAndLendingIntitutions> save(
			@RequestBody BankAndLendingIntitutions bankandlendingintitutions) {

		bankandlendingintitutions_service.save(bankandlendingintitutions);
		return new ResponseEntity<BankAndLendingIntitutions>(HttpStatus.OK);
	}
}
