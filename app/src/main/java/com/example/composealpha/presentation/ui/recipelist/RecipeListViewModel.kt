package com.example.composealpha.presentation.ui.recipelist

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.composealpha.domain.Movie
import com.example.composealpha.repository.MovieRepositoy
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class RecipeListViewModel
@Inject constructor(private val repository: MovieRepositoy,
                  @Named("auth_token") private val token: String
    ): ViewModel() {

        val movies: MutableState<List<Movie>> = mutableStateOf(listOf())

    init {
        viewModelScope.launch {
            val result = repository.discover(
                token = token,
                page = 1
            )
            movies.value = result
        }
    }
}