package com.Villagevisitors.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Villagevisitors.Repository.Village_visitorsRepo;
import com.Villagevisitors.model.Village_Visitors;

@Service
public class Village_visitorsService {

	@Autowired
	private Village_visitorsRepo village_visitorsrepo;

	public void save(Village_Visitors village_visitors) {
		village_visitorsrepo.save(village_visitors);
	}

}
