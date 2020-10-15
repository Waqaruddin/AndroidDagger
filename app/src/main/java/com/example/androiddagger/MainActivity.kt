package com.example.androiddagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var messageProviders: MessageProviders

    override fun onCreate(savedInstanceState: Bundle?) {

        (application as MyApplicationActivity).applicationComponent.inject(this)


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv = findViewById<TextView>(R.id.text_view_message)
        tv!!.text = messageProviders.getMessage()

    }


    class MessageProviders @Inject constructor() {

        fun getMessage(): String {
            return "Hello, universe"
        }
    }
}