package com.lcwu.hotelNexus.service;

import com.lcwu.hotelNexus.enitites.Hotel;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public interface HotelService {




    Hotel createNewHotel(Hotel hotel);

    Hotel getHotelDetailsById(String hotelId);

    List<Hotel> getAllHotels();


}
