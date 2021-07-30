package com.proway.example.myapplication.classes

//para chamar banco de dados ele chama por id neste caso, se não, deixar o mais simples possivel

enum class TipoVeiculo(val id: Int, val key: String) {


    CARRO(1, "key carro"),
    MOTO(2, "key moto"),
    CAMINHÃO(3, "key caminhão");
}