package com.proway.example.myapplication.classes

class Formulario(
    var name: String?,
    var email: String?,
    var password: String?
) {
    constructor():this( null,null,null)

    fun chekAllFields() : Boolean{
        return checkName() && checkEmail() && checkPassword()
    }
    private fun checkName() : Boolean{
        return !name.isNullOrEmpty()
    }
    private fun checkEmail() : Boolean{
        return !email.isNullOrEmpty()
    }
    private fun checkPassword() : Boolean{
        return !password.isNullOrEmpty()
    }
}
