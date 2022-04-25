package com.example.api_learn.Bookings.Controller

import com.example.api_learn.Bookings.Models.BookingsModel
import com.example.api_learn.Bookings.Service.IBookingServices
import lombok.RequiredArgsConstructor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/bookings")
class BookingsApi {

    @Autowired
    lateinit var bookingsService: IBookingServices


    // get all bookings
    @GetMapping("/all")
    fun getAllBookings() {
        bookingsService.getBookings();
    }

    // save booking
    @PostMapping("/save")
    fun saveBooking(booking: BookingsModel):ResponseEntity<BookingsModel> {
      return  bookingsService.saveBooking(booking);
    }
}