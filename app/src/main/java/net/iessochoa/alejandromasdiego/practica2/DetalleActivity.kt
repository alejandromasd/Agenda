package net.iessochoa.alejandromasdiego.practica2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DetalleActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_DATOS = "practica2.DatosRecetaActivity.dato"
        const val EXTRA_TIPO = "practica2.DatosRecetaActivity.tipo"
    }
    private lateinit var tvDatos:TextView
    private lateinit var tvTipo:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle)
        //Asignamos las variables a cada textView
        tvDatos = findViewById(R.id.tvDetalle)
        tvTipo = findViewById(R.id.tvTituloDetalles)

        val datos = intent.getStringExtra(EXTRA_DATOS)
        val tipo = intent.getStringExtra(EXTRA_TIPO)
        tvTipo.text = tipo
        tvDatos.text = datos


        //Obtenemos boton volver y le asignamos un evento para salir
        val btVolver = findViewById<Button>(R.id.btVolver)

        //Evento botón volver
        btVolver.setOnClickListener {
            finish()
        }
    }
}