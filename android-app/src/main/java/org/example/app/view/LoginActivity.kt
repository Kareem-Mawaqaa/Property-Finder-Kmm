/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

package org.example.app.view

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import org.example.app.R
import org.example.library.presenation.account.login.LoginViewModel


class LoginActivity : AppCompatActivity()  {

    val loginViewModel: LoginViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)



//        loginViewModel.attachView(this)

        val edEmail = findViewById<EditText>(R.id.email)
        val edPassword = findViewById<EditText>(R.id.password)


        findViewById<Button>(R.id.login).setOnClickListener {

        }


        loginViewModel.viewState.addObserver {  loginViewState ->

            loginViewState.loginResponse?.let {

            }

        }
    }




    override fun onPause() {
        super.onPause()

//        loginViewModel.deAttachView()
    }

}
