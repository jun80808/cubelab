package com.example.cubelab.category

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cubelab.R
import androidx.category.app.Category
import kotlinx.android.synthetic.main.activity_category.*
import java.util.*

class Category : AppCompatActivity() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_category,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_1.setOnClickListener {
            startActivity(Intent(context,emargyTop::class.java))
        }
        btn_2.setOnClickListener {
            startActivity(Intent(context,emargyTop::class.java))
        }
        btn_3.setOnClickListener {
            startActivity(Intent(context,emargyTop::class.java))
        }
        btn_4.setOnClickListener {
            startActivity(Intent(context,emargyTop::class.java))
        }
        btn_5.setOnClickListener {
            startActivity(Intent(context,emargyTop::class.java))
        }
        btn_6.setOnClickListener {
            startActivity(Intent(context,emargyTop::class.java))
        }
        btn_7.setOnClickListener {
            startActivity(Intent(context,emargyTop::class.java))
        }
        btn_8.setOnClickListener {
            startActivity(Intent(context,emargyTop::class.java))
        }
        btn_9.setOnClickListener {
            startActivity(Intent(context,emargyTop::class.java))
        }
        btn_10.setOnClickListener {
            startActivity(Intent(context,emargyTop::class.java))
        }
        btn_11.setOnClickListener {
            startActivity(Intent(context,emargyTop::class.java))
        }
        btn_12.setOnClickListener {
            startActivity(Intent(context,emargyTop::class.java))
        }
        btn_13.setOnClickListener {
            startActivity(Intent(context,emargyTop::class.java))
        }
        btn_14.setOnClickListener {
            startActivity(Intent(context,emargyTop::class.java))
        }
        btn_15.setOnClickListener {
            startActivity(Intent(context,emargyTop::class.java))
        }

    }
}