package com.willianrojas.app5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val boton =findViewById<Button>(R.id.button)

        boton.setOnClickListener{
            val textto = findViewById<EditText>(R.id.id_edit_text)
            val hola=textto.text.toString();
           Toast.makeText(this, hola, Toast.LENGTH_LONG).show()
            val intent = Intent(this,mySeconActivity::class.java)
            intent.putExtra("nombre" ,textto.text.toString())
            startActivity(intent)
        }

    }
}