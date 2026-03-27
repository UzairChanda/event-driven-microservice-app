package com.lcwu.user.nexus.UsersNexus.serviceimpl;

import com.lcwu.user.nexus.UsersNexus.entities.Hotel;
import com.lcwu.user.nexus.UsersNexus.entities.Ratings;
import com.lcwu.user.nexus.UsersNexus.entities.User;
import com.lcwu.user.nexus.UsersNexus.exceptions.ResourceNotFoundException;
import com.lcwu.user.nexus.UsersNexus.external.services.HotelService;
import com.lcwu.user.nexus.UsersNexus.external.services.RatingsService;
import com.lcwu.user.nexus.UsersNexus.repositories.UserRepository;
import com.lcwu.user.nexus.UsersNexus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private HotelService hotelService;

    @Autowired
    private RatingsService ratingsService;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public User getUser(String userId) {

        User user =  userRepo.findById(userId).orElseThrow(ResourceNotFoundException::new);
       // http://localhost:8082/ratings/users/f19e28cf-eb87-4a91-9729-0152fd55c5ab
       /*ArrayList userRatings = restTemplate.getForEntity("http://localhost:8082/ratings/users/"+userId , ArrayList.class).getBody();
       user.setRatings(userRatings);*/
        //http://localhost:8081/hotels/95b92af0-8645-4bdb-a04f-08f092201b04
      //restTemplate.getForObject("")

      Ratings [] userRatings  = restTemplate.getForObject("http://RATINGS-NEXUS/ratings/users/"+userId, Ratings[].class);
      //Ratings [] userRatings = new Ratings[]{ratingsService.getRatingsByUserId(userId)};
        List<Ratings> ratings =  Arrays.stream(userRatings).toList();

            List<Ratings> ratingsList  =  ratings.stream().map( rating -> {
          // ResponseEntity<Hotel> obj  = restTemplate.getForEntity("http://HOTELNEXUS/hotels/"+rating.getHotelId(), Hotel.class);
           Hotel hotel = hotelService.getHotelbyId(rating.getHotelId());
           rating.setHotel(hotel);
            return  rating;
       }).collect(Collectors.toList());
        user.setRatings((ArrayList<Ratings>) ratingsList);
        return user;
    }
}
