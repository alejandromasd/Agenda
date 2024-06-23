package net.iessochoa.alejandromasdiego.practica2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RecetaActivity : AppCompatActivity() {
    private lateinit var tvDescripcion: TextView
    private lateinit var tvTextoDescripcion: TextView
    private lateinit var tvIngredientes: TextView
    private lateinit var tvTextoIngredientes:TextView
    private lateinit var tvReceta:TextView
    private lateinit var tvTextoReceta:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receta)
        //Obtenemos cada textview
        tvDescripcion = findViewById(R.id.tvDescripcion)
        tvTextoDescripcion = findViewById(R.id.tvDescripcionReceta)
        tvIngredientes = findViewById(R.id.tvIngredientes)
        tvTextoIngredientes = findViewById(R.id.tvDescripcionIngredientes)
        tvReceta = findViewById(R.id.tvReceta)
        tvTextoReceta = findViewById(R.id.tvDescripcionCompleta)

        tvTextoDescripcion.setOnClickListener {
            llamaActivityDatos(tvDescripcion.text.toString(),tvTextoDescripcion.text.toString())
        }
        tvTextoIngredientes.setOnClickListener {
            llamaActivityDatos(tvIngredientes.text.toString(),tvTextoIngredientes.text.toString())
        }
        tvTextoReceta.setOnClickListener {
            llamaActivityDatos(tvReceta.text.toString(),tvTextoReceta.text.toString())
        }
    }
    fun llamaActivityDatos(tipo: String, dato: String) {
        val intent = Intent(this,DetalleActivity::class.java)
        intent.putExtra(DetalleActivity.EXTRA_TIPO,tipo)
        intent.putExtra(DetalleActivity.EXTRA_DATOS,dato)
        startActivity(intent)
    }
}