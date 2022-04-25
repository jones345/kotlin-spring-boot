package com.example.api_learn.Bookings.Models

import lombok.Data

import java.util.Date
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Data
@Entity
@Table(name="bookings")
class BookingsModel {
    var Name: String? = null
    var DateStart: Date? = null
    var DateEnd: Date? = null
    var description: String? = null
    @Id @GeneratedValue var id: Long? = null

}