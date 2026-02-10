package com.trip.tripmanagement.repository;

import com.trip.tripmanagement.entity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, Integer> {
}
