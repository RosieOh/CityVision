package com.cityvision.domain.user.domain;

import com.cityvision.domain.reservation.domain.Reservation;
import com.cityvision.domain.trip.domain.Trip;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;

    // 위치 이력 및 예약 정보
    @OneToMany(mappedBy = "user")
    private List<Trip> trips;

    @OneToMany(mappedBy = "user")
    private List<Reservation> reservations;

       // Getters, Setters, Constructors
}
