package com.example.composealpha.di

import com.example.composealpha.BuildConfig
import com.example.composealpha.network.MovieService
import com.example.composealpha.network.model.MovieDtoMapper
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideMovieMapper(): MovieDtoMapper = MovieDtoMapper()

    @Singleton
    @Provides
    fun provideMovieService(retrofit: Retrofit): MovieService = retrofit.create(MovieService::class.java)

    @Singleton
    @Provides
    @Named("auth_token")
    fun provideAuthToken(): String = "e9e690206c5709a32678c99230ce1a1e"

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient, @Named("base_url") Base_URL: String): Retrofit =
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(Base_URL)
            .client(okHttpClient)
            .build()

    @Provides
    @Singleton
    fun provideOkHttpClient() = if (BuildConfig.DEBUG) {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .build()
    } else OkHttpClient
        .Builder()
        .build()

    @Provides
    @Singleton
    @Named("base_url")
    fun provideBaseUrl(): String {
        return "https://api.themoviedb.org/3/"
    }
}