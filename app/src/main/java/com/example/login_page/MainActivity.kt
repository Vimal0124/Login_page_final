package com.example.login_page

import android.content.Intent
import android.hardware.biometrics.BiometricManager
import android.hardware.biometrics.BiometricManager.Authenticators.BIOMETRIC_STRONG
import android.hardware.biometrics.BiometricManager.Authenticators.DEVICE_CREDENTIAL
import android.hardware.biometrics.BiometricPrompt
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    lateinit var emailaddress:EditText
    lateinit var passwordfiled:EditText
    lateinit var loginbtn:Button
    lateinit var signupbtn:Button
    lateinit var username:String
    lateinit var passowrd:String
    lateinit var info:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            emailaddress = findViewById(R.id.emailusername)
        passwordfiled = findViewById(R.id.password)
        loginbtn = findViewById(R.id.button)
        signupbtn = findViewById(R.id.button2)
        username = "vimal1098@gmail.com"
        passowrd = "vimal"

         loginbtn.setOnClickListener{
             if(emailaddress.text.isNullOrBlank() && passwordfiled.text.isNullOrBlank()  )
             {
                 Toast.makeText(this,"Please Enter the Username and Password",Toast.LENGTH_SHORT).show()
             }
             else
             {

                 Toast.makeText(this,"${emailaddress.text}is logged in successfully",Toast.LENGTH_SHORT).show()
                 val intent = Intent(this,Homeactivity::class.java)
                 startActivity(intent)
             }
        }
        signupbtn.setOnClickListener{
            Toast.makeText(this,"Biometric Authentication Failed Please login using Username And password!",Toast.LENGTH_SHORT).show()
        }
        }

    }
