package com.proway.example.myapplication.classes

fun main(){

val num = 9
    val retorno =
        if(num>9)"Numero é maior que 9" else if(num>6)"entre 7 e 9" else "menor que 6"
    println(retorno)

    val retornoWhen = when(num){
        in 0..4 -> "regular"
        in 5..7 -> "bom"
        in 8..10 -> "otimo"
        else -> "Nenhum número informado"
    }
    println(retornoWhen)

    println(TipoVeiculo.CAMINHÃO)







//    val cachorro = Cachorro()
//    val cobra = Cobra()
//    val veiculo = Veiculo()
//
//    val altoFalante = AltoFalante()
//
//    altoFalante.reproduzirSom(object : Som{
//        override fun ruido(): String{
//            return "Som aleatorio"
//        }
//    })
//
//
//    altoFalante.reproduzirSom(cachorro)
//    altoFalante.reproduzirSom(cobra)
//    altoFalante.reproduzirSom(veiculo)
//
//
}

fun printTipoVeiculo(tipo: TipoVeiculo){
    when (tipo){
        TipoVeiculo.CARRO -> println("Selecionado ${TipoVeiculo.CARRO}")
        TipoVeiculo.CAMINHÃO -> println("Selecionado ${TipoVeiculo.CAMINHÃO}")
        TipoVeiculo.MOTO -> println("Selecionado ${TipoVeiculo.MOTO.id} -- ${TipoVeiculo.MOTO.key}")
    }
}



