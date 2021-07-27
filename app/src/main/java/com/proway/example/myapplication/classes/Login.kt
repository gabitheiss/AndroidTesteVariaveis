package com.proway.example.myapplication.classes
//? no final diz que o valor pode vir nulo
class Login (
    var email: String?,
    var senha: String?
) {
    constructor() : this(null,null)

    fun checkEmail(): Boolean{
        return (!email.isNullOrEmpty() && email!!.contains("@"))
        //!!força mostrar que tem valor
        //! diz que é ao contrario, email náo é vazio nem nulo
    }
    fun checkSenha() : Boolean{
        return !senha.isNullOrEmpty()
    }
    fun concatenar(): String{
        return "Email: $email +++++++++ Senha: $senha"
    }
}

