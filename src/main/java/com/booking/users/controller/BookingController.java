package com.booking.users.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.booking.users.entity.Booking;
import com.booking.users.service.BookingService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
@RestController
@RequestMapping("/api/bookings")
public class BookingController {
  
  private final BookingService bookingService;
  public BookingController(BookingService bookingService) {
    this.bookingService = bookingService;
  }
  @PostMapping
  public Booking create(@RequestBody Booking booking) {
    return bookingService.createBooking(booking);
  }
  @GetMapping
  public List<Booking> getAll() {
    return bookingService.getAll();
  }
  @GetMapping("/{id}")
  public Booking getDetail(@PathVariable Long id) {
    return bookingService.getById(id);
  }
  @PutMapping({"/{id}"})
  public Booking update(@PathVariable Long id, @RequestBody Booking updatedBooking) {
    return bookingService.update(id, updatedBooking);
  }
}
