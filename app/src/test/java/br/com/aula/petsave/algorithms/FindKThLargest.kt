package br.com.aula.petsave.algorithms

import org.junit.Test
import java.util.*

class FindKThLargest {


    @Test
    fun findKThLargestTest(){
        val intArray = intArrayOf( 12, 30, 11, 43, 51, 10, 9, 89 )
        intArray.sort()

        val findKThLargest = 2


        val result = intArray[intArray.size - findKThLargest]
        println(result)
    }

}