package com.proway.example.myapplication.classes

class Cobra(val veneno: Boolean) : Animal ("réptil"), Som{

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