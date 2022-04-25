package com.example.api_learn.Bookings.Service

import com.example.api_learn.Bookings.Models.BookingsModel
import com.example.api_learn.Bookings.Repository.BookingRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class BookingsServicesImple:IBookingServices  {

    @Autowired
    lateinit var bookingRepository: BookingRepository

    override fun getBookings(): List<BookingsModel> {
        return bookingRepository.findAll()
    }

    override fun saveBooking(booking: BookingsModel): ResponseEntity<BookingsModel> {
        return ResponseEntity.ok(bookingRepository.save(booking))
    }
}