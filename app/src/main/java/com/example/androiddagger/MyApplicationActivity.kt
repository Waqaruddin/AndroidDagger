package com.example.androiddagger

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import javax.inject.Inject

class MyApplicationActivity : Application() {

    val applicationComponent = DaggerApplicationComponent.create()

    override  fun onCreate(){
        super.onCreate()

    }
}


