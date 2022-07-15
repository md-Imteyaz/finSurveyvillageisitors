package com.Villagevisitors.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Villagevisitors.model.Activities;

@Repository
public interface ActivitiesRepo extends JpaRepository<Activities, Long> {

}
