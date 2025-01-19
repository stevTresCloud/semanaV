package com.hgga.msa.bookingmicroservice.repository;

import com.hgga.msa.bookingmicroservice.entity.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<BookingEntity, Long> {
}
