package com.proway.example.myapplication.classes

class Veiculo(
     var motor: String,
     var combustivel: String,
): Som, Movimentacao {

    constructor(): this("","")
    constructor(motor: String) : this(motor, "")

     fun verificarMotor() : Boolean {
        return motor.isNotEmpty() && motor.length >=2
         //retorna true, substitui o if
    }
     fun verificarCombustivel(){
        println(combustivel)
    }

    override fun ruido(): String {
        return ""
    }

    override fun frente(): String {
        return ""
    }

    override fun lado() {

    }

    override fun randon() {

    }
}