package com.example.composealpha.di

import com.example.composealpha.network.MovieService
import com.example.composealpha.network.model.MovieDtoMapper
import com.example.composealpha.repository.MovieRepositoryImpl
import com.example.composealpha.repository.MovieRepositoy
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideMovieRepository(
        movieService: MovieService,
        movieDtoMapper: MovieDtoMapper
    ): MovieRepositoy = MovieRepositoryImpl(
        movieService, movieDtoMapper
    )
}
