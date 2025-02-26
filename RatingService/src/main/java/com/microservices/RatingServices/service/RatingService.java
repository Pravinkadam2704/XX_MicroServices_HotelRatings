package com.microservices.RatingServices.service;

import com.microservices.RatingServices.entities.Rating;

import java.util.List;

public interface RatingService {

    //create
    Rating saveRating(Rating rating);

    //get all ratings
    List<Rating> getAllRatings();

    //get all by UserId
    List<Rating> getRatingByUserId(String userId);

    //get all by HotelId
    List<Rating> getRatingByHotelId(String hotelId);
}
