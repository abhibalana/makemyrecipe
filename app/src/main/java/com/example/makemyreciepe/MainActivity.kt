package com.example.makemyreciepe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.makemyreciepe.entities.Recipies

class MainActivity : AppCompatActivity() {
    var arrMainCategory  = ArrayList<Recipies>()

            override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}