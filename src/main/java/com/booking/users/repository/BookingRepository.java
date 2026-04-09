package com.booking.users.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.booking.users.entity.Booking;
import java.util.List;
public interface BookingRepository  extends JpaRepository<Booking, Long> {
    List<Booking> findByPassengerId(Long passengerId);
}
