package com.trip.tripmanagement.repository;

import com.trip.tripmanagement.entity.Destination;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DestinationRepository extends JpaRepository<Destination, Integer> {
}
