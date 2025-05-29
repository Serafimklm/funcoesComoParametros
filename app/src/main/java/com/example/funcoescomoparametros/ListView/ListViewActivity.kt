package com.example.funcoescomoparametros.ListView

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.funcoescomoparametros.R

class ListViewActivity : AppCompatActivity() {

    private lateinit var ListaViewUsers : ListView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.list_users)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val ListaDeUser = listOf(
            "pedro", "rafael", "luana", "marcia"
        )
        ListaViewUsers= findViewById(R.id.listUsers)
        ListaViewUsers.adapter = ArrayAdapter(this, // contexto
            android.R.layout.simple_list_item_1, // contexto, layout, dados, no caso esse e apenas um layou de texto simples
            android.R.id.text1, // ID de cada item
            ListaDeUser);  // por ultimo o que sera usado como base para o texto.

    }
}