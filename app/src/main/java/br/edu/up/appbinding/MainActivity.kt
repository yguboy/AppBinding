package br.edu.up.appbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import br.edu.up.appbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Abordagem declarativa
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnAlterar.setOnClickListener {
            binding.txtAlterar.text = "Estado alterado!"
        }

        //Abordagem imperativa
        /*
        setContentView(R.layout.activity_main)
        val texto = findViewById<TextView>(R.id.txtAlterar)
        val botao = findViewById<Button>(R.id.btnAlterar)
        botao.setOnClickListener(View.OnClickListener {
            texto.text = "Texto alterado!"
        })
         */
    }
}