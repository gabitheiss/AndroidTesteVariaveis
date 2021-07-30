package com.proway.example.myapplication.classes

class Veiculo(
     var motor: String,
     var combustivel: String,
     var tipoVeiculo: TipoVeiculo?

): Som, Movimentacao {
    constructor(): this("", "",null)
    constructor(motor: String) : this(motor, "",null)



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