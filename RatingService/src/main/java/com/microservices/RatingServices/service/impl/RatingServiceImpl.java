package com.microservices.RatingServices.service.impl;

import com.microservices.RatingServices.entities.Rating;
import com.microservices.RatingServices.repositories.RatingRespository;
import com.microservices.RatingServices.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRespository ratingRespository;

    @Override
    public Rating saveRating(Rating rating) {
        String randomId = UUID.randomUUID().toString();
        rating.setRatingId(randomId);
        return ratingRespository.save(rating);
    }

    @Override
    public List<Rating> getAllRatings() {
        return ratingRespository.findAll();
    }

    @Override
    public List<Rating> getRatingByUserId(String userId) {
        return ratingRespository.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingByHotelId(String hotelId) {
        return ratingRespository.findByHotelId(hotelId);
    }
}
