package com.proway.example.myapplication.classes

open class Animal(
    val categoria:String
) {
    //open serve quando está usando herança, para sobescrever
    open fun movimentar(){
        println("Animal se movimentando")
    }
}