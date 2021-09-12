package com.example.composealpha.repository

import com.example.composealpha.domain.Movie
import com.example.composealpha.network.model.MovieDTO

interface MovieRepositoy {

    suspend fun discover(token: String, page: Int): List<Movie>

    suspend fun get(token: String, id: Int): Movie
}