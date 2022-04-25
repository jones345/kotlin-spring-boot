package com.example.api_learn.Bookings.Repository

import com.example.api_learn.Bookings.Models.BookingsModel
import org.springframework.data.jpa.repository.JpaRepository

interface BookingRepository:JpaRepository<BookingsModel,Long> {
}