package com.example.diversain

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class tela_de_noticias1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_de_noticias1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // o "<>" é o tipo da imagem, butao ou texto
        // dps mudar o id
        // dps mudar o @, que o primeiro é o que vc esta e o dps da , é o que vc quer ir

        val imagem2 = findViewById<ImageView>(R.id.imageView20)
        imagem2.setOnClickListener {
            val intent = Intent(this@tela_de_noticias1, tela_da_loja::class.java)
            startActivity(intent)
        }
        
    }
}