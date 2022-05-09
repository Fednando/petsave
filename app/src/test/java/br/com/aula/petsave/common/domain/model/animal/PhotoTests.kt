package br.com.aula.petsave.common.domain.model.animal

import org.junit.Assert
import org.junit.Test

class PhotoTests {

    private val mediumPhoto = "mediumPhoto"
    private val fullPhoto = "fullPhoto"
    private val invalidPhoto = ""

    @Test
    fun photo_gerSmallestAvailablePhoto_hasMediumPhoto(){
        //Given
        val photo = Media.Photo(mediumPhoto, fullPhoto)
        val expectedValue = mediumPhoto

        //When
        val smallestPhoto = photo.getSmallestAvailablePhoto()

        //Then
        Assert.assertEquals(smallestPhoto, expectedValue)

    }

    @Test
    fun photo_gerSmallestAvailablePhoto_noMediumPhoto(){
        //Given
        val photo = Media.Photo(invalidPhoto, fullPhoto)
        val expectedValue = fullPhoto

        //When
        val smallestPhoto = photo.getSmallestAvailablePhoto()

        //Then
        Assert.assertEquals(smallestPhoto, expectedValue)

    }

    @Test
    fun photo_gerSmallestAvailablePhoto_noPhoto(){
        //Given
        val photo = Media.Photo(invalidPhoto, invalidPhoto)
        val expectedValue = Media.EMPTY_MEDIA

        //When
        val smallestPhoto = photo.getSmallestAvailablePhoto()

        //Then
        Assert.assertEquals(smallestPhoto, expectedValue)

    }
}