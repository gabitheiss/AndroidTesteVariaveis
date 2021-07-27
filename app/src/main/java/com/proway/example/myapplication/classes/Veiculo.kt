package com.proway.example.myapplication.classes

class Veiculo(
     var motor: String,
     var combustivel: String,
) {

    constructor(): this("","")
    constructor(motor: String) : this(motor, "")

     fun verificarMotor() : Boolean {
        return motor.isNotEmpty() && motor.length >=2
         //retorna true, substitui o if
    }
     fun verificarCombustivel(){
        println(combustivel)
    }
}