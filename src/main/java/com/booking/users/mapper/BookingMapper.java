package com.booking.users.mapper;
import com.booking.users.dto.BookingHistoryItemDTO;
import com.booking.users.entity.Booking;
import org.springframework.stereotype.Component;

@Component
public class BookingMapper {
    public BookingHistoryItemDTO toDTO(Booking booking) {
        return new BookingHistoryItemDTO(
            booking.getId(),
            booking.getPickupLocation(),
            booking.getDropoffLocation(),
            booking.getStatus(),
            booking.getDistanceKm(),
            booking.getTotalFare()
        );
    }
}
