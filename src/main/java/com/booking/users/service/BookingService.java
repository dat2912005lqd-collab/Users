package com.booking.users.service;
import java.util.List;

import org.springframework.stereotype.Service;
import com.booking.users.repository.BookingRespository;
import com.booking.users.entity.Booking;
@Service
public class BookingService {
    private final BookingRespository bookingRespository;
    public BookingService(BookingRespository bookingRespository) {
        this.bookingRespository = bookingRespository;
    }
    public Booking createBooking(Booking booking) {
        booking.setStatus("Pending");
        return bookingRespository.save(booking);
    }
    public List<Booking> getAll() {
        return bookingRespository.findAll();
    }
    public Booking getById(Long id) {
        if (id == null) {
            return null;
        }
        return bookingRespository.findById(id).orElse(null);
    }
    public Booking update(Long id, Booking updatedBooking) {
       Booking booking = getById(id);
       booking.setCustomerName(updatedBooking.getCustomerName());
       booking.setPhone(updatedBooking.getPhone());
       booking.setService(updatedBooking.getService());
       booking.setBookingTime(updatedBooking.getBookingTime());
       return bookingRespository.save(booking);
    }
}

