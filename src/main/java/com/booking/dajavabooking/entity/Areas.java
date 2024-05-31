package com.booking.dajavabooking.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class Areas {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String areaId;
    String areaName;
    String areaImage;
}
