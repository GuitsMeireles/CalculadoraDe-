package com.calpor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.calpor.databinding.ActivityMainBinding
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalcular.setOnClickListener {
            val valor = binding.editTextValor.text.toString().toDouble()
            val porcentagem = binding.editTextPorcentagem.text.toString().toDouble()

            val resultadoSoma = valor + (valor * (porcentagem / 100))
            val resultadoSubtracao = valor - (valor * (porcentagem / 100))

            val format = DecimalFormat("#.##")

            binding.textViewResultado.text = "Resultado: Soma = ${format.format(resultadoSoma)}, Subtração: = ${format.format(resultadoSubtracao)}"
        }
    }
}