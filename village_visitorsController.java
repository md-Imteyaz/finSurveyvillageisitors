package com.Villagevisitors.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Villagevisitors.model.Village_Visitors;
import com.Villagevisitors.service.Village_visitorsService;

@RestController
public class village_visitorsController {

	@Autowired
	private Village_visitorsService village_visitorsService;

	@PostMapping("/createVillagevisitors")
	public ResponseEntity<Village_Visitors> save(@RequestBody Village_Visitors village_vistors) {
		village_visitorsService.save(village_vistors);
		return new ResponseEntity<Village_Visitors>(HttpStatus.OK);
	}
}
