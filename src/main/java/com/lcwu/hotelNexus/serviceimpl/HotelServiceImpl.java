package com.lcwu.hotelNexus.serviceimpl;

import com.lcwu.hotelNexus.enitites.Hotel;
import com.lcwu.hotelNexus.exception.ResourceNotFoundException;
import com.lcwu.hotelNexus.repositories.HotelRepository;
import com.lcwu.hotelNexus.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl  implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;


    @Override
    public Hotel createNewHotel(Hotel hotel) {

        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel getHotelDetailsById(String hotelId) {
        return hotelRepository.findById(hotelId).orElseThrow(() -> new ResourceNotFoundException("Given Hotel DOES NOT EXISTS !!!!"));
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }
}
