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
@Table(name = "Hotels")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int hotelId;
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
    @ManyToOne
    @JoinColumn(name = "area_id")
    Area area;
    @OneToMany(mappedBy = "hotel")
    List<Room> rooms;
    @ManyToOne
    @JoinColumn(name = "hotelType_id")
    HotelType hotelType;
    @OneToMany(mappedBy = "hotel")
    List<Favourite> favourites;
    @OneToOne
    @JoinColumn(name = "user_id")
    User user;

}
