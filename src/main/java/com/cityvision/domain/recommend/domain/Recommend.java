package com.cityvision.domain.recommend.domain;

import com.cityvision.domain.user.domain.User;
import jakarta.persistence.*;
import lombok.*;

@Entity
@ToString
@Builder(toBuilder = true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Recommend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String recommendedRoute;        // 추천 경로 정보 (경로 리스트 또는 지도 링크)
    private double estimatedTime;           // 예상 소요시간
    private double distance;                // 경로 거리
    private String transportationMode;      // 추천 교통 수단
}
