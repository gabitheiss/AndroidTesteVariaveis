package com.proway.example.myapplication.classes

abstract class Animal(
    val categoria:String
) : Som, Movimentacao {

    //open serve para quando está usando herança, para sobescrever
    open fun movimentar(){
        println("Animal se movimentando")
    }

}