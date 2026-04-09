package com.booking.users.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "bookings")
public class Booking {
    public Booking() {}

    public Booking(String phone, String customerName, String service, LocalDateTime bookingTime) {
        this.phone = phone;
        this.customerName = customerName;
        this.Service = service;
        this.bookingTime = bookingTime;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String phone;
    private String customerName;
    private String Service;
    private String status;
    private LocalDateTime bookingTime;
    private Long passengerId;
    private String pickupLocation;
    private String dropoffLocation;
    private String distanceKm;
    private String totalFare;
public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public String getPhone() {
    return phone;
}
public void setPhone(String phone) {
    this.phone = phone;
}
public String getCustomerName() {
    return customerName;
}
public void setCustomerName(String customerName) {
    this.customerName = customerName;
}
public String getService() {
    return Service;
}
public void setService(String Service) {
    this.Service = Service;
}
public String getStatus() {
    return status;
}
public void setStatus(String status) {
    this.status = status;
}
public LocalDateTime getBookingTime() {
    return bookingTime;
}
public void setBookingTime(LocalDateTime bookingTime) {
    this.bookingTime = bookingTime;
}

public Long getPassengerId() {
    return passengerId;
}

public void setPassengerId(Long passengerId) {
    this.passengerId = passengerId;
}

public String getPickupLocation() {
    return pickupLocation;
}

public void setPickupLocation(String pickupLocation) {
    this.pickupLocation = pickupLocation;
}

public String getDropoffLocation() {
    return dropoffLocation;
}

public void setDropoffLocation(String dropoffLocation) {
    this.dropoffLocation = dropoffLocation;
}

public String getDistanceKm() {
    return distanceKm;
}

public void setDistanceKm(String distanceKm) {
    this.distanceKm = distanceKm;
}

public String getTotalFare() {
    return totalFare;
}

public void setTotalFare(String totalFare) {
    this.totalFare = totalFare;
}

}

