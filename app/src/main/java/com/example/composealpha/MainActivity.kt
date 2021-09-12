package com.example.composealpha

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.composealpha.domain.Movie
import com.example.composealpha.network.model.MovieDtoMapper
import com.example.composealpha.network.model.MovieDTO

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mapper = MovieDtoMapper()

        val movie = Movie()

        val networkEntity: MovieDTO = mapper.mapFromDomainModel(movie)

        val m: Movie = mapper.mapToDomainModel(networkEntity)

        val deleteit: String
    }
}

