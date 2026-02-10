package com.trip.tripmanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "travel_details")
public class TravelDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "travel_id")
    private Integer travelId;

    @Column(name = "trip_id")
    private Integer tripId;

    @Column(name = "transport_mode")
    private String transportMode;

    @Column(name = "source_city")
    private String sourceCity;

    @Column(name = "travel_duration_hours")
    private Integer travelDurationHours;

    @Column(name = "travel_notes")
    private String travelNotes;

    // ===== Getters & Setters =====

    public Integer getTravelId() {
        return travelId;
    }

    public void setTravelId(Integer travelId) {
        this.travelId = travelId;
    }

    public Integer getTripId() {
        return tripId;
    }

    public void setTripId(Integer tripId) {
        this.tripId = tripId;
    }

    public String getTransportMode() {
        return transportMode;
    }

    public void setTransportMode(String transportMode) {
        this.transportMode = transportMode;
    }

    public String getSourceCity() {
        return sourceCity;
    }

    public void setSourceCity(String sourceCity) {
        this.sourceCity = sourceCity;
    }

    public Integer getTravelDurationHours() {
        return travelDurationHours;
    }

    public void setTravelDurationHours(Integer travelDurationHours) {
        this.travelDurationHours = travelDurationHours;
    }

    public String getTravelNotes() {
        return travelNotes;
    }

    public void setTravelNotes(String travelNotes) {
        this.travelNotes = travelNotes;
    }
}
