package com.example.composealpha.repository

import com.example.composealpha.domain.Movie
import com.example.composealpha.network.MovieService
import com.example.composealpha.network.model.MovieDtoMapper

class MovieRepositoryImpl(
    private val movieService: MovieService,
    private val mapper: MovieDtoMapper
) : MovieRepositoy {
    override suspend fun discover(token: String, page: Int, query: String): List<Movie> {
        return mapper.toDomainList(movieService.discoverMovies(page = page).movies)
    }

    override suspend fun get(token: String, id: Int): Movie {
        TODO("Not yet implemented")
    }

}