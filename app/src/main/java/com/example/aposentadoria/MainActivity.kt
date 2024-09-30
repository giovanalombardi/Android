package com.example.aposentadoria

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Configurando o Spinner (UF)
        val spinnerUF: Spinner = findViewById(R.id.spinnerUF)
        ArrayAdapter.createFromResource(
            this,
            R.array.uf_options,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerUF.adapter = adapter
        }

        // Configurando o botão de envio
        val buttonSubmit: Button = findViewById(R.id.buttonSubmit)
        buttonSubmit.setOnClickListener {
            val nome = findViewById<EditText>(R.id.editTextNome).text.toString()
            val dataNascimento = findViewById<EditText>(R.id.editTextDataNascimento).text.toString()
            val email = findViewById<EditText>(R.id.editTextEmail).text.toString()
            val cpf = findViewById<EditText>(R.id.editTextCPF).text.toString()
            val endereco = findViewById<EditText>(R.id.editTextEndereco).text.toString()
            val bairro = findViewById<EditText>(R.id.editTextBairro).text.toString()
            val uf = spinnerUF.selectedItem.toString()
            val numero = findViewById<EditText>(R.id.editTextNumero).text.toString()
            val cidade = findViewById<EditText>(R.id.editTextCidade).text.toString()
            val cep = findViewById<EditText>(R.id.editTextCEP).text.toString()
            val celular = findViewById<EditText>(R.id.editTextCelular).text.toString()

            // Exemplo de como exibir os dados
            Toast.makeText(this, "Dados enviados:\nNome: $nome\nEmail: $email", Toast.LENGTH_SHORT).show()
        }
    }
}
