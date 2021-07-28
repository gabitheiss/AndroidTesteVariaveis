package com.proway.example.myapplication.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar
import com.proway.example.myapplication.R
import com.proway.example.myapplication.classes.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.buttonSave).apply {
            setOnClickListener {
                checkFields(it)
            }
        }
    }
        private fun checkFields(view: View) {
            var form = Formulario()

            findViewById<EditText>(R.id.editText).apply {
                form.name = text.toString()

            }
            findViewById<EditText>(R.id.editText2).apply {
                form.email = text.toString()
            }
            findViewById<EditText>(R.id.editText3).apply {
                form.password = text.toString()
            }

            if (form.chekAllFields()){
                val intent = Intent(this, ApplicationActivity::class.java)
                startActivity(intent)


//                Snackbar.make(
//                    view, "${form.name} - ${form.email} - ${form.password}", Snackbar.LENGTH_LONG
//                ).show()
            }else{
                Snackbar.make(view, getString(R.string.message_error),Snackbar.LENGTH_LONG).show()
            }



        }



        //val cachorro = Cachorro()
        //cachorro.movimentar()

        //val cobra = Cobra()
        //cobra.movimentar()



//        var login = Login(null,null)
//        login.email = "t_gaaby@hotmail.com"
//        login.senha = "123"
//
//        if(login.email != null){
//            println(login.email!!.length)
//
//        }
//        login.senha?.apply {
//            println(this)
//        }



//        var PrimeiroVeiculo = Veiculo(combustivel = "diesel", motor = "v6").apply {
//            val retornoDaFuncao1 = primeiroVeiculo.verificarMotor()
//            }

//        val SegundoVeiculo = Veiculo()
//            val retornoDaFuncao2 = segundoVeiculo.verificarMotor()
//
//        val TerceiroVeiculo = Veiculo("v5")
//            val retornoDaFuncao3 = terceiroVeiculo.verificarMotor()

    }
