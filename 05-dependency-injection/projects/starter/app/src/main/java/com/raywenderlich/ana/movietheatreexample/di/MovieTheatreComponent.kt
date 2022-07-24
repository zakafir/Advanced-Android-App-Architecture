package com.raywenderlich.ana.movietheatreexample.di

import com.raywenderlich.ana.movietheatreexample.MovieTheatre
import dagger.Component

@Component
interface MovieTheatreComponent {
    fun getMovieTheatre(): MovieTheatre
}