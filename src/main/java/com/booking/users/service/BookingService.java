package com.booking.users.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.booking.users.repository.BookingRepository;
import com.booking.users.entity.Booking;
import com.booking.users.dto.BookingHistoryItemDTO;
import java.util.stream.Collectors;
import com.booking.users.mapper.BookingMapper;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class BookingService{
 @Autowired
    public BookingRepository bookingRepository;
    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }
    public Booking createBooking(Booking booking) {
        booking.setStatus("Pending");
        return bookingRepository.save(booking);
    }
    public List<Booking> getAll() {
        return bookingRepository.findAll();
    }
    public Booking getById(Long id) {
        if (id == null) {
            return null;
        }
        return bookingRepository.findById(id).orElse(null);
    }
    public Booking update(Long id, Booking updatedBooking) {
       Booking booking = getById(id);
       booking.setCustomerName(updatedBooking.getCustomerName());
       booking.setPhone(updatedBooking.getPhone());
       booking.setService(updatedBooking.getService());
       booking.setBookingTime(updatedBooking.getBookingTime());
       return bookingRespository.save(booking);
    }
    @Autowired
    private BookingMapper bookingMapper;
    public List<BookingHistoryItemDTO> getBookingHistoryForPassenger(Long passengerId) {
        List<Booking> bookings = bookingRepository.findByPassengerId(passengerId);
        return bookings.stream()
                .map(booking -> bookingMapper.toDTO(booking))
                .collect(Collectors.toList());
    }
}

