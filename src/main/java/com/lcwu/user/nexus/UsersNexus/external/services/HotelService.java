package com.lcwu.user.nexus.UsersNexus.external.services;

import com.lcwu.user.nexus.UsersNexus.entities.Hotel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "HOTEL-NEXUS")
public interface HotelService {

    @GetMapping("/hotels/{hotelId}")
    Hotel getHotelbyId(@PathVariable String  hotelId);
}
