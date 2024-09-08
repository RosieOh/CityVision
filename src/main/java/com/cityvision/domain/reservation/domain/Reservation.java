package com.cityvision.domain.reservation.domain;

import com.cityvision.domain.user.domain.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@Builder(toBuilder = true)
@ToString()
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String transportationMode; // 교통 수단 (예: 택시, 자전거, 카셰어링)
    private String startPoint;
    private String endPoint;
    private LocalDateTime reservationTime;

    // Getters, Setters, Constructors
}