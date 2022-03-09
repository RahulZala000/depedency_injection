package com.example.dependecy_injection

import android.nfc.Tag
import android.util.Log

class EmailService {

    fun Send(to:String,from:String,body:String){
        Log.d("@Email","Email sent")
    }
}