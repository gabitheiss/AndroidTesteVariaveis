package com.proway.example.myapplication.classes

class PessoaJuridica () : Pessoas(caracteristicas = "Juridica"){

    override fun temDuasPernas() {
        println("Pessoa juridica tem duas pernas")
        super.temDuasPernas()
    }
}