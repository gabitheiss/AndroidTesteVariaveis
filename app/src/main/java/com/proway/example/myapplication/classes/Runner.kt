package com.proway.example.myapplication.classes

fun main(){

    val cachorro = Cachorro()
    val cobra = Cobra()
    val veiculo = Veiculo()

    val altoFalante = AltoFalante()

    altoFalante.reproduzirSom(object : Som{
        override fun ruido(): String{
            return "Som aleatorio"
        }
    })


    altoFalante.reproduzirSom(cachorro)
    altoFalante.reproduzirSom(cobra)
    altoFalante.reproduzirSom(veiculo)


}



