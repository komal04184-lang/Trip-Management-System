package com.trip.tripmanagement.controller;

import com.trip.tripmanagement.entity.Transport;
import com.trip.tripmanagement.repository.TransportRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transports")
public class TransportController {

    private final TransportRepository transportRepository;

    public TransportController(TransportRepository transportRepository) {
        this.transportRepository = transportRepository;
    }

    // CREATE transport
    @PostMapping
    public Transport createTransport(@RequestBody Transport transport) {
        return transportRepository.save(transport);
    }

    // READ all transports
    @GetMapping
    public List<Transport> getAllTransports() {
        return transportRepository.findAll();
    }
}
