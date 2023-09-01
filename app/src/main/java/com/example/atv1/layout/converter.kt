package com.example.atv1.layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.atv1.R

class converter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_converter)

        val editTextConvertido =  findViewById<EditText>(R.id.editTextConvertido)
        val buttonConverter = findViewById<Button>(R.id.buttonConverter)
        val editTextUserValue = findViewById<EditText>(R.id.editTextUserValue)

        val taxaDeConversao = 5.0

        buttonConverter.setOnClickListener{

            val valorDoUsuario = editTextUserValue.text.toString().toDoubleOrNull()

            if (valorDoUsuario != null) {
                val valorConvertido = valorDoUsuario * taxaDeConversao

                editTextConvertido.setText("R$ %.2f".format(valorConvertido)) // Exemplo de formatação para exibir 2 casas decimais
            } else {
                editTextConvertido.setText("Valor inválido")
            }
        }


    }
}