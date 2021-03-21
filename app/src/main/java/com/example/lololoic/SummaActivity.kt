package com.example.lololoic

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class SummaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bitmap1= BitmapFactory.decodeResource(resources,R.drawable.gal)
        val rounded = RoundedBitmapDrawableFactory.create(resources,bitmap1)
        rounded.cornerRadius=15f// rounded corners
        // for full circular
       // rounded.isCircular=true
      // logo.setImageDrawable(rounded)

    }
}