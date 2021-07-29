package com.proway.example.myapplication.classes

class Cobra : Animal ("réptil"){

    override  fun movimentar(){
        println("Cobra rasteja")
        super.movimentar()
    }

    override fun ruido(): String {
        return "shshshs..."
    }

    override fun frente(): String {
        return  ""
    }

    override fun lado() {

    }

    override fun randon() {

    }
}