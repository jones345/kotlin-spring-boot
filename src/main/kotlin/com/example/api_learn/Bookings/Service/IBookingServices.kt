package com.example.api_learn.Bookings.Service

import com.example.api_learn.Bookings.Models.BookingsModel
import org.springframework.http.ResponseEntity

interface IBookingServices {

    fun getBookings(): List<BookingsModel>
    fun saveBooking(booking: BookingsModel): ResponseEntity<BookingsModel>
}