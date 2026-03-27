package com.lcwu.hotelNexus.controllers;

import com.lcwu.hotelNexus.enitites.Hotel;
import com.lcwu.hotelNexus.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping("/createNewHotel")
    public ResponseEntity<Hotel> createNewHotel(@RequestBody Hotel hotel){
        Hotel newHotel = hotelService.createNewHotel(hotel);
        return new ResponseEntity<Hotel>(newHotel, HttpStatus.OK);
    }
    @GetMapping("/getAllHotels")
    public ResponseEntity<List<Hotel>> getAllHotels(){
        List<Hotel> allHotels = hotelService.getAllHotels();
        return new ResponseEntity<>(allHotels,HttpStatus.OK);
    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable String hotelId){
        Hotel hotel = hotelService.getHotelDetailsById(hotelId);
        return  new ResponseEntity<>(hotel,HttpStatus.OK);
    }
}
