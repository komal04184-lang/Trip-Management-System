package com.trip.tripmanagement.controller;

import com.trip.tripmanagement.entity.TravelDetail;
import com.trip.tripmanagement.repository.TravelDetailRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/travel-details")
public class TravelDetailController {

    private final TravelDetailRepository travelDetailRepository;

    public TravelDetailController(TravelDetailRepository travelDetailRepository) {
        this.travelDetailRepository = travelDetailRepository;
    }

    @PostMapping
    public TravelDetail createTravelDetail(@RequestBody TravelDetail travelDetail) {
        return travelDetailRepository.save(travelDetail);
    }

    @GetMapping
    public List<TravelDetail> getAllTravelDetails() {
        return travelDetailRepository.findAll();
    }
}
