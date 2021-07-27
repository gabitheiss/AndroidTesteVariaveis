package com.proway.example.myapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.proway.example.myapplication.R
import com.proway.example.myapplication.classes.Login
import com.proway.example.myapplication.classes.Veiculo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var login = Login(null,null)
        login.email = "t_gaaby@hotmail.com"
        login.senha = "123"

        if(login.email != null){
            println(login.email!!.length)

        }
        login.senha?.apply {
            println(this)
        }



//        var PrimeiroVeiculo = Veiculo(combustivel = "diesel", motor = "v6").apply {
//            val retornoDaFuncao1 = primeiroVeiculo.verificarMotor()
//            }

//        val SegundoVeiculo = Veiculo()
//            val retornoDaFuncao2 = segundoVeiculo.verificarMotor()
//
//        val TerceiroVeiculo = Veiculo("v5")
//            val retornoDaFuncao3 = terceiroVeiculo.verificarMotor()

    }
}