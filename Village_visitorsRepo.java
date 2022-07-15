package com.Villagevisitors.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Villagevisitors.model.Village_Visitors;

@Repository
public interface Village_visitorsRepo extends JpaRepository<Village_Visitors,Integer> {

}
