package com.lcwu.user.nexus.UsersNexus.entities;


import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Hotel {

    private String hotelID;
    private String hotelName;
    private String hotelLocation;
    private String hotelType;
    private String hotelAmenities;
}
