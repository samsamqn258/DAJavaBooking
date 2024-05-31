package com.booking.dajavabooking.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hotels {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String hotelId;
    String hotelName;
    String hotelImage1;
    String hotelImage2;
    String hotelImage3;
    String hotelAddress;
    String hotelDescription;
    double averageScore;
    @Column(length = 11)
    String phoneNumber;
    boolean isActive;
}
