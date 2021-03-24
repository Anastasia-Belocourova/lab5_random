package com.example.random5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn)
        val textView1 = findViewById<TextView>(R.id.textView1)
        val textView2 = findViewById<TextView>(R.id.textView2)
        val sumTextView = findViewById<TextView>(R.id.sumTextView)

        btn.setOnClickListener {
            val random1 = Random.nextInt(10, 99) +1
            val random2 = Random.nextInt(100, 999) +1
            textView1.text = random1.toString()
            textView2.text = random2.toString()
            sumTextView.text = "Сумма сгенерированных чисел = " + (random1 + random2).toString()
        }
    }
}