package com.booking.dajavabooking.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;


@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Evaluates")
public class Evaluate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int evaluateId;
    String commentGood;
    String commentBad;
    LocalDate evaluationTime;
    double evaluationScore;
    String evaluationImage1;
    String evaluationImage2;

    @OneToOne
    @JoinColumn(name = "payment_id")
    Payment payment;

}
