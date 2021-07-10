package com.jramirez.instamovies.data.repository

import com.jramirez.instamovies.data.model.Media

interface MoviesRepository {

    suspend fun getMedia(genreId: Int) : List<Media>
}