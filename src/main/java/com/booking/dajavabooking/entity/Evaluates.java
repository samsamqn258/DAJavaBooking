package com.booking.dajavabooking.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import java.time.LocalDateTime;


@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Evaluates {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String evaluateId;
    String commentGood;
    String commentBad;
    LocalDateTime evaluationTime;
    double evaluationScore;
    String evaluationImage1;
    String evaluationImage2;
}
