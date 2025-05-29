package com.example.funcoescomoparametros.teste

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.funcoescomoparametros.R

class MainActivity1 : AppCompatActivity() {

    private lateinit var textResultado: TextView
    private lateinit var buttonExecute: Button
    private var cliqueCount = 0;

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.list_users)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        buttonExecute = findViewById(R.id.buttonExecute)
        textResultado = findViewById(R.id.textResultado)


//------------------COMO USAR UM TOAST----------------------------------------------------------------
        buttonExecute.setOnClickListener {
            cliqueCount++
            textResultado.text = "BOTAO EXECUTADO $cliqueCount VEZES"
            Toast.makeText(
                this,
                "BOTAO EXECUTADO",
                Toast.LENGTH_SHORT
            ).show()   // duracao do Toast, short = curta
        }

    }


   }
