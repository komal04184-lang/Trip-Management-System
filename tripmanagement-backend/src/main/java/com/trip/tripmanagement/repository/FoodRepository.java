package com.trip.tripmanagement.repository;

import com.trip.tripmanagement.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Integer> {
}
