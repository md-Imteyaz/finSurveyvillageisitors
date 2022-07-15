package com.Villagevisitors.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Villagevisitors.Repository.ActivitiesRepo;
import com.Villagevisitors.model.Activities;

@Service
public class ActivitiesService {
	@Autowired
	private ActivitiesRepo activitiesrepo;

	public void save(Activities activities) {
		activitiesrepo.save(activities);
	}
}
