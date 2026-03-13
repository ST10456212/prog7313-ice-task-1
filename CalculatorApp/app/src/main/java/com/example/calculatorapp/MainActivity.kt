package com.example.calculatorapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var btn_add : Button
    lateinit var btn_subt : Button
    lateinit var btn_mlpt : Button
    lateinit var btn_div : Button

    lateinit var et_a : EditText
    lateinit var et_b : EditText
    lateinit var et_ans : TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btn_add = findViewById(R.id.btn_add)
        btn_subt = findViewById(R.id.btn_subt)
        btn_mlpt = findViewById(R.id.btn_mlpt)
        btn_div = findViewById(R.id.btn_div)

        et_a = findViewById(R.id.et_a)
        et_b = findViewById(R.id.et_b)
        et_ans = findViewById(R.id.et_ans)

        // ADD
        btn_add.setOnClickListener {
            val a = et_a.text.toString().toDouble()
            val b = et_b.text.toString().toDouble()
            val result = a + b
            et_ans.text = "Answer: $result"
        }

        // SUBTRACT
        btn_subt.setOnClickListener {
            val a = et_a.text.toString().toDouble()
            val b = et_b.text.toString().toDouble()
            val result = a - b
            et_ans.text = "Answer: $result"
        }

        // MULTIPLY
        btn_mlpt.setOnClickListener {
            val a = et_a.text.toString().toDouble()
            val b = et_b.text.toString().toDouble()
            val result = a * b
            et_ans.text = "Answer: $result"
        }

        // DIVIDE
        btn_div.setOnClickListener {
            val a = et_a.text.toString().toDouble()
            val b = et_b.text.toString().toDouble()
            val result = a / b
            et_ans.text = "Answer: $result"
        }
    }
}