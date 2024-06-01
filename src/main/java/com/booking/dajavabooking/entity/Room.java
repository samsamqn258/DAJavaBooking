package com.booking.dajavabooking.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Rooms")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int roomId;
    String roomNumber;
    String roomImage1;
    String roomImage2;
    String roomImage3;
    double pricePerNight;
    boolean isActive;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    Hotel hotel;

    @OneToMany(mappedBy = "room")
    List<Booking> bookings;

    @ManyToOne
    @JoinColumn(name = "roomType_id")
    RoomType roomType;
}
