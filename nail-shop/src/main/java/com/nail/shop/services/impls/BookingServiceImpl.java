package com.nail.shop.services.impls;

import com.nail.shop.models.Booking;
import com.nail.shop.services.BookingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {
    @Override
    public void booking(Booking booking) {

    }

    @Override
    public List<Booking> findBookingByUserId(String userId) {
        return null;
    }

    @Override
    public Booking findBookingById(String bookingId) {
        return null;
    }
}
