package com.example.dependecy_injection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var userRepo: UserRepo = UserRepo()
        var emailService: EmailService = EmailService()

        var userregister=UserRegisterService(userRepo,emailService)

        userregister.registeruser("zrm@gmail.com","13456789")

    }
}