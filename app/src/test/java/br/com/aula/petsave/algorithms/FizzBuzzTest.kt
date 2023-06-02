package br.com.aula.petsave.algorithms

import org.junit.Test

class FizzBuzzTest{

    @Test
    fun fizzBuzzTest(){
        println((1..100).map { index ->
            mapOf(
                0 to index,
                index % 3 to "Fizz",
                index % 5 to "Buzz",
                index % 15 to "Fizz Buzz"
            )[0]
        })

    }
}
