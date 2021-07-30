package com.proway.example.myapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.proway.example.myapplication.R

class TesteInterface : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teste_interface)

        val buttonSave = findViewById<Button>(R.id.buttonSave)
        val buttonTest = findViewById<Button>(R.id.buttonTest)
        buttonSave.setOnClickListener(this)
        buttonTest.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        v?.let {
            when (it.id) {
                R.id.buttonSave -> {
                    Snackbar.make(it, getString(R.string.botao_login), Snackbar.LENGTH_LONG).show()
                }
                //exemplo de string sem chamar as strings
                R.id.buttonTest -> {
                    Snackbar.make(it, "Test", Snackbar.LENGTH_LONG).show()
                }
            }
        }
    }
}
