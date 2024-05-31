package com.booking.dajavabooking.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class HotelTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String hotelTypeId;
    @Column(length = 254)
    String hotelTypeName;
    @Column(length = 254)
    String hotelTypeImage;
}
