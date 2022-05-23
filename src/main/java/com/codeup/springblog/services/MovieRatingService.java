package com.codeup.springblog.services;

import com.codeup.springblog.models.MovieRating;
import com.codeup.springblog.repositories.MovieRatingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieRatingService {


    public MovieRatingRepository movieRatingDao;

    public MovieRatingService(MovieRatingRepository movieRatingDao) {
        this.movieRatingDao = movieRatingDao;
    }


    public double getAverageRatingForMovie(Long movieId) {

        List<MovieRating> ratings = movieRatingDao.findByMovie_IdEquals(movieId);

        double total = 0;

        for(MovieRating rating : ratings) {
            total += rating.getUserRating();
        }


        return total / (double) ratings.size();

    }

}
