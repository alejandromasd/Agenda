package net.iessochoa.alejandromasdiego.practica2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class AgendaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agenda)
        //Creamos las variables obtener para cada campo
        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etApellido = findViewById<EditText>(R.id.etApellidos)
        val btAceptar = findViewById<Button>(R.id.btAceptar)
        val btCancelar = findViewById<Button>(R.id.btCancelar)
        val tvTitulo = findViewById<TextView>(R.id.tvTitulo)
        //Evento click botón aceptar
        btAceptar.setOnClickListener {
            val nombre = etNombre.text.toString()
            val apellido = etApellido.text.toString()
            //Comprobamos que el nombre y el apellido no esten vacios
            if (nombre.isNotEmpty() && apellido.isNotEmpty()) {
                tvTitulo.text = nombre + " " + apellido;
            } else {
                Toast.makeText(this,"Es necesario introducir el Nombre y el Apellido ",
                    Toast.LENGTH_SHORT).show()
            }
        }
        //Evento click botón cancelar
        btCancelar.setOnClickListener {
            finish()
        }
    }
}