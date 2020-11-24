package com.example.daggertester.main

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.daggertester.MyApp
import com.example.daggertester.R
import com.example.daggertester.resource.Resource
import com.example.daggertester.second.SecondActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var resource: Resource

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as MyApp).appComponent.mainComponent().inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("KKKKKKKKKKKKKKKKKKKKKKK MainActivity $resource ")

        val button = this.findViewById<Button>(R.id.button1)
        button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

    }
}