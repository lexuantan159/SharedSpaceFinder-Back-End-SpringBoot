package com.example.sharedspacefinder.services.booking;

import com.example.sharedspacefinder.models.Booking;

public interface BookingService {
    void update(Booking booking);
    Booking findById(Integer id);
    void delete(Integer id);
    Iterable<Booking> findAll();
}
