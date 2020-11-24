package com.example.daggertester.second

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggertester.MyApp
import com.example.daggertester.R
import com.example.daggertester.resource.Resource
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import javax.inject.Inject

class SecondActivity : AppCompatActivity() {

    @Inject
    lateinit var resource: Resource

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as MyApp).appComponent.secondComponent().inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)
        setSupportActionBar(findViewById(R.id.toolbar))

        println("KKKKKKKKKKKKKKKKKKKKKKK MainActivity ${resource} ")

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }
}