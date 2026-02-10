package com.trip.tripmanagement.repository;

import com.trip.tripmanagement.entity.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository extends JpaRepository<Trip, Integer> {
}
