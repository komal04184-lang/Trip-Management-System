package com.trip.tripmanagement.controller;

import com.trip.tripmanagement.entity.Food;
import com.trip.tripmanagement.repository.FoodRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/foods")
public class FoodController {

    private final FoodRepository foodRepository;

    public FoodController(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    // CREATE food
    @PostMapping
    public Food createFood(@RequestBody Food food) {
        return foodRepository.save(food);
    }

    // READ all food entries
    @GetMapping
    public List<Food> getAllFood() {
        return foodRepository.findAll();
    }
}
