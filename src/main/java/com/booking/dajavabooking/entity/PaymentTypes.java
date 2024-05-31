package com.booking.dajavabooking.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class PaymentTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String paymentTypeId;
    String paymentTypeName;
}
