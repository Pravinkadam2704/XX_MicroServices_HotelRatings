package com.microservices.HotelServices.services;

import com.microservices.HotelServices.entities.Hotel;

import java.util.List;

public interface HotelService {

    //create
    Hotel saveHotel(Hotel hotel);

    //getAll
    List<Hotel> getAllHotels();

    //get single
    Hotel getHotel(String hotelId);

}
