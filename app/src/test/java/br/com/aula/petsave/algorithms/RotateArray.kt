package br.com.aula.petsave.algorithms

import org.junit.Test

class RotateArray {
    @Test
    fun retateArray(){
        val arrayRotate = intArrayOf(1, 2, 3, 5, 7, 8, 20).leftShift(3)
        arrayRotate.forEach {
            println(it)
        }

        println(arrayRotate.toString())
    }


    fun IntArray.leftShift(k: Int): IntArray{
        val shiftedArray = this.copyOf()
        var rotateBy = k

        if(rotateBy > size){
            rotateBy = rotateBy % size
        }

        forEachIndexed{ index, value ->
            println("index : $index  size : $size   rotateby : $rotateBy")
            println(4 % size)

            val shiftedIndex = (index + (size - rotateBy)) % size
            println("shiftedIndex : $shiftedIndex  :::::: value $value")
            shiftedArray[shiftedIndex] = value
        }


        return shiftedArray
    }
}