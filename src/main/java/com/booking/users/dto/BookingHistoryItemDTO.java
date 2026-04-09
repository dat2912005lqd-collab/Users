package com.booking.users.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingHistoryItemDTO {
    private Long id ;
    private String pickupLocation;
    private String dropoffLocation;
    private String status;
    private String distanceKm;
    private String totalFare;

}
