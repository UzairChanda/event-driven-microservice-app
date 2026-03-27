package com.lcwu.hotelNexus.repositories;

import com.lcwu.hotelNexus.enitites.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel,String> {


}
