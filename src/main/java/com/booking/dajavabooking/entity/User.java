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
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int userId;
    String email;
    String password;
    String userName;
    String phoneNumber;
    int role;
    String userImage;

    @OneToMany(mappedBy = "user")
    List<Booking> bookings;

    @OneToMany(mappedBy = "user")
    List<Favourite> favourites;

    @OneToOne(mappedBy = "user")
    Hotel hotel;
}
