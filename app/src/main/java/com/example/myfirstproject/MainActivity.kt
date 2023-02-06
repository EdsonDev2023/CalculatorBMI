package com.example.myfirstproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btncalcular: Button = findViewById(R.id.btnCalcular)
        val edtpeso : EditText = findViewById(R.id.edtPeso)
        val edtaltura : EditText = findViewById(R.id.edtaltura)


        btncalcular.setOnClickListener {


            val alturaStr = edtaltura.text.toString()
            val pesoStr = edtpeso.text.toString()

            if (alturaStr.isNotEmpty() && pesoStr.isNotEmpty()) {
                val altura: Float = alturaStr.toFloat()
                val peso: Float = pesoStr.toFloat()


                val alturafinal: Float = altura * altura

                val result: Float = peso / alturafinal


                val intent = Intent(this, ResultActivity2::class.java)
                    .apply {
                        putExtra("EXTRA_RESULT", result)
                    }
                startActivity(intent)

            } else {
                Toast.makeText(this, "Preencher todos os campos", Toast.LENGTH_LONG).show()
            }

        }
    }
}