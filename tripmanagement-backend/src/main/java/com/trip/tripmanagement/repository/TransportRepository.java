package com.trip.tripmanagement.repository;

import com.trip.tripmanagement.entity.Transport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransportRepository extends JpaRepository<Transport, Integer> {
}
