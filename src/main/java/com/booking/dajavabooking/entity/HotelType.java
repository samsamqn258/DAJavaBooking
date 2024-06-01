package com.booking.dajavabooking.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Table(name = "HotelTypes")
public class HotelType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int hotelTypeId;
    @Column(length = 254)
    String hotelTypeName;
    @Column(length = 254)
    String hotelTypeImage;
    @OneToMany(mappedBy = "hotelType")
    List<Hotel> hotels;
}
