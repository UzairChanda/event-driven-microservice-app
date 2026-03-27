package com.lcwu.user.nexus.UsersNexus.entities;

import jakarta.persistence.Entity;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Ratings {

    private String ratingId;
    private String userId;
    private String hotelId;
    private int noOfStars;
    private String feedback;
    private  Hotel hotel;
}
