package com.Villagevisitors.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Villagevisitors.model.BankAndLendingIntitutions;

@Repository
public interface BankAndLendingIntitutions_repo extends JpaRepository<BankAndLendingIntitutions, Integer> {

}
