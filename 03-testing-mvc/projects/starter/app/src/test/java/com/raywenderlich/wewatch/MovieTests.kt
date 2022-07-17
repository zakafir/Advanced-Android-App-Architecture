package com.raywenderlich.wewatch

import org.junit.Test

class MovieTests {
    
    /*null release date*/
    @Test
    fun whenGettingYearFromReleaseDate_shouldNotBeNull() {
        // todo: find a dependency to Movie data class !!
        val movie = Movie(title = "Interstellar", releaseDate = "2014-11-05")
    }
    /*empty release date*/
    /*unformatted release date*/
    /*release date YYYY-MM-DD*/
}
