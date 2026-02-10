package com.trip.tripmanagement.controller;

import com.trip.tripmanagement.entity.Trip;
import com.trip.tripmanagement.repository.TripRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trips")
@CrossOrigin(origins = "http://localhost:3000")
public class TripController {

    private final TripRepository tripRepository;

    public TripController(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    // READ ALL TRIPS
    @GetMapping
    public List<Trip> getAllTrips() {
        return tripRepository.findAll();
    }

    // CREATE TRIP
    @PostMapping
    public Trip createTrip(@RequestBody Trip trip) {
        return tripRepository.save(trip);
    }

}
