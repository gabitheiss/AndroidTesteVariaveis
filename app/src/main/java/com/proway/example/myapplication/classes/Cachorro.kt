package com.proway.example.myapplication.classes

class Cachorro() : Animal("mamífero") {

    override  fun movimentar(){
        println("Cachorro caminha com 4 patas")
        super.movimentar()

    }

    override fun ruido(): String {
        return "latindo..."
    }

    override fun frente(): String {
        return ""
    }

    override fun lado() {

    }

    override fun randon() {

    }

}