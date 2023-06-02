package br.com.aula.petsave.algorithms

import org.junit.Test

class ReverseWord {
    @Test
    fun reverseWord(){
        // Reverse just word
        println("String".split("").reversed().joinToString(""))
        // Reverse phrase
        println("reverse words in a string ".split(" ").reversed().joinToString(" "))
    }
}