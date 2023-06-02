package br.com.aula.petsave.design_patterns.singleton

import com.google.common.truth.Truth
import org.junit.Test

object NetworkDriver {
    init {
        println("Initializing: $this")
    }

    fun log(): NetworkDriver = apply { println("Network driver: $this") }
}

class SingletonTest{
    @Test
    fun testSingleton() {
        println("Start")

        val networkDriver1: NetworkDriver = NetworkDriver.log()
        val networkDriver2: NetworkDriver = NetworkDriver.log()



    }
}