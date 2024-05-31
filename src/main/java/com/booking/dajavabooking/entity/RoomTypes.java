package com.booking.dajavabooking.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class RoomTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String roomTypeId;
    String roomTypeName;
}
