package com.lcwu.hotelNexus.enitites;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "micro_hotels")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "hotel_id")
    private String hotelID;
    @Column(name = "hotel_name")
    private String hotelName;
    @Column(name = "hotel_location")
    private String hotelLocation;
    @Column(name =  "hotel_type")
    private String hotelType;
    @Column(name = "hotel_amenities")
    private String hotelAmenities;
}
