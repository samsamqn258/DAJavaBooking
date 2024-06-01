package com.booking.dajavabooking.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;


@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int bookingId;
    LocalDate bookingTime;
    LocalDate checkInDate;
    LocalDate checkOutDate;
    // ok ok ok
    // Kéo về đây đi con
    ////
    /// ok
    boolean bookingStatus;
    boolean paymentStatus;
    double bookingPrice;

    @ManyToOne
    @JoinColumn(name = "room_id")
    Room room;

    @OneToOne(mappedBy = "booking")
    Payment payment;



    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;
}
