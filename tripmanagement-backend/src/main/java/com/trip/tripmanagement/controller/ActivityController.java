package com.trip.tripmanagement.controller;

import com.trip.tripmanagement.entity.Activity;
import com.trip.tripmanagement.repository.ActivityRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/activities")
public class ActivityController {

    private final ActivityRepository activityRepository;

    public ActivityController(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    @PostMapping
    public Activity create(@RequestBody Activity activity) {
        return activityRepository.save(activity);
    }

    @GetMapping
    public List<Activity> getAll() {
        return activityRepository.findAll();
    }
}
