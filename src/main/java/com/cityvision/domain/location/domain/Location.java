package com.cityvision.domain.location.domain;

import com.cityvision.domain.trafficdata.domain.TrafficData;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@Builder(toBuilder = true)
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;            // 위치 이름
    private double latitude;
    private double longitude;

    @OneToMany(mappedBy = "location")
    private List<TrafficData> trafficData;
}
