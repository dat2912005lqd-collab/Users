package com.booking.users.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.booking.users.entity.Booking;
public interface BookingRespository  extends JpaRepository<Booking, Long> {
    
}
