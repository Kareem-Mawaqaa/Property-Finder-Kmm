/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

package org.example.app.view

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import dev.icerock.moko.mvvm.ViewModelFactory
import dev.icerock.moko.mvvm.createViewModelFactory
import dev.icerock.moko.mvvm.getViewModel
import org.example.app.AppComponent
import org.example.app.R
import org.example.library.SharedFactory
import org.example.library.data.account.login.LoginRequest
import org.example.library.data.account.login.LoginResponse
import org.example.library.data.account.login.OCustomer
import org.example.library.presenation.BaseError
import org.example.library.presenation.account.login.LoginView
import org.example.library.presenation.account.login.LoginViewModel


class LoginActivity : AppCompatActivity(), LoginView {

    val loginViewModel: LoginViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        loginViewModel.attachView(this)

        val edEmail = findViewById<EditText>(R.id.email)
        val edPassword = findViewById<EditText>(R.id.password)

        findViewById<Button>(R.id.login).setOnClickListener {

            loginViewModel.login(
                LoginRequest(
                    "123456", 1,
                    OCustomer(
                        "1234", 1, "432",
                        edEmail.editableText.toString(),
                        edPassword.editableText.toString(),
                    )
                )
            )

        }


    }


    override fun onLoginSuccess(response: LoginResponse) {
        Toast.makeText(this, "Hi ${response.APIMessage}", Toast.LENGTH_LONG).show()

    }

    override fun goToHomeScreen() {
//        Intent(this, LoginActivity::class.java).apply { startActivity(this) }
    }

    override fun onLoading(status: Boolean) {
        findViewById<ProgressBar>(R.id.progress).visibility =
            if (status) View.VISIBLE else View.GONE
    }

    override fun onError(error: BaseError) {
        // TODO Show Alert Dialog
        Toast.makeText(this, "Error ${error.message}", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()

        loginViewModel.deAttachView()
    }

}
