package com.example.myfirstproject

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView

class ResultActivity2 : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result2)

        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val result = intent.getFloatExtra("EXTRA_RESULT", 0.1f)
        val tvresult = findViewById<TextView>(R.id.textview_result)
        val tvclassificacao = findViewById<TextView>(R.id.TextView_Classificação)

        tvresult.text = result.toString()

       var classificacao = ""

               if(result < 18.5){
                   classificacao="               MAGREZA:                Índices abaixo de 18.5 não são considerados saudáveis segundo a OMS, entretanto, a pessoa pode muito bem apresentar um biotipo longilíneo e ser saudável."

               }else if(result >= 18.5 && result < 25){
                   classificacao ="                  NORMAL:               Indivíduos com IMCs entre 18.5 e 25 são considerados normais; nesse caso, a necessidade de emagrecer é, na maioria das vezes, de ordem estética."
               }else if(result >= 25f&& result < 30){
                   classificacao ="               SOBREPESO:                      Entre 25 e 30, o indivíduo é considerado acima do peso, apresentando maiores chances de apresentar complicações, como diabetes, hipertensão arterial e hipercolesterolemia."
               }else if(result >= 30 && result < 40){
                   classificacao = "               OBESIDADE I:               Pessoas com IMCs acima de 30 são consideradas obesas, por isso, em virtude do alto risco de complicações metabólicas, é extremamente recomendável procurar um médico."
               }else if(result >= 40){
                   classificacao = "         OBESIDADE GRAVE:                Pessoas com IMCs acima de 40 devem procurar um médico por grandes riscos de desenvolver doênças e alto risco de complicações metabólicas."
               }

        tvclassificacao.text = classificacao
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }
}





