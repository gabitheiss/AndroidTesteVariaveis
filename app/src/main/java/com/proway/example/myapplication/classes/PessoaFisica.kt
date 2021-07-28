package com.proway.example.myapplication.classes

class PessoaFisica () : Pessoas (caracteristicas = "Física"){

    override fun temDuasPernas() {
        println("Pessoa física tem duas pernas")
        super.temDuasPernas()
    }
}
