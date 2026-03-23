package com.booking.users.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="booking")
public class booking {
    public booking() {}
    public booking(String pickupLocation, String dropoffLocation, String status) {
        this.pickupLocation = pickupLocation;
        this.dropoffLocation = dropoffLocation;
        this.status = status;
    }
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pickupLocation;  
    private String dropoffLocation;
    private String status;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    


}