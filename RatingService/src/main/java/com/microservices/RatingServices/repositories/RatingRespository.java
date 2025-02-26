package com.microservices.RatingServices.repositories;

import com.microservices.RatingServices.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRespository extends JpaRepository<Rating,String> {

    //custom finder methods

    List<Rating> findByUserId(String userId);
    List<Rating> findByHotelId(String hotelId);
}
