package com.booking.dajavabooking.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Table(name = "Areas")
public class Area {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int areaId;
    String areaName;
    String areaImage;
    @OneToMany(mappedBy = "area")
    List<Hotel> hotels;
}
