package com.lcwu.user.nexus.UsersNexus.external.services;

import com.lcwu.user.nexus.UsersNexus.entities.Ratings;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "RATINGS-NEXUS")
public interface RatingsService {

    @GetMapping("ratings/users/{userId}")
    Ratings getRatingsByUserId(@PathVariable String userId);
}
