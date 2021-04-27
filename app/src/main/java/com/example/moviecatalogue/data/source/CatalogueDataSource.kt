package com.example.moviecatalogue.data.source

import androidx.lifecycle.LiveData
import com.example.moviecatalogue.data.model.Movie
import com.example.moviecatalogue.data.model.TvShow

interface CatalogueDataSource {
    fun getMovies(page: Int): LiveData<List<Movie>>
    fun getTvShows(page: Int):  LiveData<List<TvShow>>
}