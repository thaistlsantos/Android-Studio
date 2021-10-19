package com.example.calculo_do_imc


import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular: Button = findViewById(R.id.calcular)
        btCalcular.setOnClickListener {RealizarCalculo() }
    }

    fun RealizarCalculo() {
        val txtPeso: EditText = findViewById(R.id.peso)
        val txtAltura: EditText = findViewById(R.id.altura)
        //val lblImc: TextView = findViewById(R.id.calcular)
        val resultado :TextView = findViewById(R.id.resultado)


        val peso: Double = txtPeso.text.toString().toDouble()
        val altura: Double = txtAltura.text.toString().toDouble()
        val imc: Double = peso / (altura * altura);

        if (imc < 18.5) {
            resultado.setTextColor(Color.BLUE)
            resultado.setText("O seu IMC é: $imc e você está abaixo do peso")
        } else if (imc > 18.5 && imc < 24.9) {
            resultado.setTextColor(Color.GREEN)
            resultado.setText("O seu IMC é: $imc e você está com o peso ideal")
        } else if (imc > 25 && imc < 29.9) {
            resultado.setTextColor(Color.RED)
            resultado.setText("O seu IMC é: $imc e você está com sobrepeso")
        } else if (imc > 30 && imc < 34.9) {
            resultado.setTextColor(Color.RED)
            resultado.setText("O seu IMC é: $imc e você está com obesidade grau I")
        } else if (imc > 35 && imc < 29.9) {
            resultado.setTextColor(Color.RED)
            resultado.setText("O seu IMC é: $imc e você está com obesidade grau II")
        } else if (imc > 40) {
            resultado.setTextColor(Color.RED)
            resultado.setText("O seu IMC é: $imc e você está com obesidade grau III")
        }
    }
}


