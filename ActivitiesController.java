package com.Villagevisitors.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Villagevisitors.model.Activities;
import com.Villagevisitors.service.ActivitiesService;

@RestController
public class ActivitiesController {

	@Autowired
	private ActivitiesService activitiesservice;

	@PostMapping("/craeteActivities")
	public ResponseEntity<Activities> save(@RequestBody Activities activities) {
		activitiesservice.save(activities);
		return new ResponseEntity<Activities>(HttpStatus.OK);

	}

}
