package com.hgga.msa.bookingmicroservice.service;

import com.hgga.msa.bookingmicroservice.entity.BookingEntity;
import com.hgga.msa.bookingmicroservice.repository.BookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public BookingEntity addBooking(BookingEntity booking) {
        return bookingRepository.save(booking);
    }

    public List<BookingEntity> getAllBookings() {
        return bookingRepository.findAll();
    }

    public BookingEntity getBookingById(Long id) {
        return bookingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Booking not found with id: " + id));
    }

    public BookingEntity updateBooking(BookingEntity booking) {
        if (!bookingRepository.existsById(booking.getId())) {
            throw new RuntimeException("Booking not found with id: " + booking.getId());
        }
        return bookingRepository.save(booking);
    }

    public void deleteBooking(Long id) {
        if (!bookingRepository.existsById(id)) {
            throw new RuntimeException("Booking not found with id: " + id);
        }
        bookingRepository.deleteById(id);
    }
}
