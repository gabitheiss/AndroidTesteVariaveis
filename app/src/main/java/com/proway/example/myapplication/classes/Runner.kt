package com.proway.example.myapplication.classes






fun main() {
 val arrayDeAnimais = arrayListOf<Animal?>()
    arrayDeAnimais.add(Cachorro())
    arrayDeAnimais.add(Cobra())
    arrayDeAnimais.add(Cobra())
    arrayDeAnimais.add(null)

    arrayDeAnimais.size // 4 posições

    arrayDeAnimais.forEach { animal ->

        animal?.apply {
            var ruido:String = ""
            if (this is Cobra){
                ruido = (this as Cobra).ruido()
            }else if (this is Cachorro){
                ruido = (this as Cachorro).ruido()
            }
            println(ruido)
        }


    }





//    val a = ArrayList<Animal>()
//        a.add(Cachorro())
//        a.add(Cobra())
//        a.add(Cobra())
//        a.add(Cobra())
//
//    a.size
//    a[3]
//
//
//    val arrayString = emptyArray<String>()
//
//    val arrayDeNumeros = arrayOf(10, 30, 20, 3, 5)


    val num = 9
    val retorno =
        if (num > 9) "Numero é maior que 9" else if (num > 6) "entre 7 e 9" else "menor que 6"
    println(retorno)

    val retornoWhen = when (num) {
        in 0..4 -> "regular"
        in 5..7 -> "bom"
        in 8..10 -> "otimo"
        else -> "Nenhum número informado"
    }
    println(retornoWhen)

    println(TipoVeiculo.CAMINHÃO)

    val veiculo = Veiculo(combustivel = "diesel", motor = "2.0", tipoVeiculo = TipoVeiculo.CAMINHÃO)


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

fun printTipoVeiculo(tipo: TipoVeiculo) {
    when (tipo) {
        TipoVeiculo.CARRO -> println("Selecionado ${TipoVeiculo.CARRO}")
        TipoVeiculo.CAMINHÃO -> println("Selecionado ${TipoVeiculo.CAMINHÃO}")
        TipoVeiculo.MOTO -> println("Selecionado ${TipoVeiculo.MOTO.id} -- ${TipoVeiculo.MOTO.key}")
    }
}
fun printPessoa(tipo: Pessoa){
    when (tipo){
        Pessoa.ALUNO -> println("O ${tipo} está estudando")
        Pessoa.PROFESSOR -> println("O ${tipo} está dando aula")
        Pessoa.ADM -> println("O ${tipo} está administrando")
    }
}



