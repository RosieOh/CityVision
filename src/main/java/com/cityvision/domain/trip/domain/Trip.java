package com.cityvision.domain.trip.domain;

import com.cityvision.domain.user.domain.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String startPoint;
    private String endPoint;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    private double distance; // 이동 거리
    private String transportationMode; // 교통 수단 (버스, 지하철, 자전거 등)

    // Getters, Setters, Constructors
}
