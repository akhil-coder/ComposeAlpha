package com.example.composealpha.network.model

import com.example.composealpha.domain.Movie
import com.example.composealpha.domain.util.DomainMapper

class MovieDtoMapper : DomainMapper<MovieDTO, Movie> {
    override fun mapToDomainModel(entity: MovieDTO): Movie {
        return Movie(
            id = entity.id,
            title = entity.title,
            posterPath = entity.posterPath,
            overview = entity.overview
        )
    }

    override fun mapFromDomainModel(domainModel: Movie): MovieDTO {
        return MovieDTO(
            id = domainModel.id,
            title = domainModel.title,
            posterPath = domainModel.posterPath,
            overview = domainModel.overview
        )
    }

    fun toDomainList(initial: List<MovieDTO>): List<Movie> = initial.map { mapToDomainModel(it) }

    fun fromDomainList(initial: List<Movie>): List<MovieDTO> = initial.map { mapFromDomainModel(it) }
}