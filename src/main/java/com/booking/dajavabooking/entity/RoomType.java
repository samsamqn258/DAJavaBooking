package com.booking.dajavabooking.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Table(name = "RoomTypes")

public class RoomType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int roomTypeId;
    String roomTypeName;
    @OneToMany(mappedBy = "roomType")
    List<Room> rooms;
}
