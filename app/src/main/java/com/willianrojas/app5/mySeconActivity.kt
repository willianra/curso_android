package com.willianrojas.app5

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class mySeconActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        val boton =findViewById<Button>(R.id.button2)
        val textView: TextView = findViewById(R.id.textView2)

        val nombre: String? =intent.getStringExtra("nombre")
        textView.setText(
            "el nombre es ${
                nombre
            }")
        boton.setOnClickListener{
            val intentAtras=Intent(this,MainActivity::class.java)
            startActivity(intentAtras)
        }

    }
}