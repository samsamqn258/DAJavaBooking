package com.booking.dajavabooking.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import java.time.LocalDateTime;


@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bookings {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String bookingId;
    LocalDateTime bookingTime;
    LocalDateTime checkInDate;
    LocalDateTime checkOutDate;
    // ok ok ok
    // Kéo về đây đi con
    ////
    /// ok
    boolean bookingStatus;
    boolean paymentStatus;
    double bookingPrice;
}
