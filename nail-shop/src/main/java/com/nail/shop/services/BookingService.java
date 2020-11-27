package com.nail.shop.services;

import com.nail.shop.models.Booking;

import java.util.List;

public interface BookingService {
    void booking(Booking booking);
    List<Booking> findBookingByUserId(String userId);
    Booking findBookingById(String bookingId);
}
