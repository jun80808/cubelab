package com.example.cubelab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.MenuInflater
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.example.cubelab.R
import com.example.cubelab.category.Category
import kotlinx.android.synthetic.main.*
import kotlinx.android.synthetic.main.activity_login.*
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val intent = Intent(this, Category::class.java)

        btn_login.setOnClickListener({
            startActivity(intent)
        })


    }


}



