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
@Table(name = "CancelBookings")
public class CancelBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int cancelId;
    LocalDate cancelTime;
    String cancelReason;
}
