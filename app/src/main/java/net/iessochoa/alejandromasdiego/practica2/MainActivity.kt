package net.iessochoa.alejandromasdiego.practica2
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btAgenda = findViewById<Button>(R.id.btAgenda)
        val btReceta = findViewById<Button>(R.id.btReceta)
        //Evento botón para abrir la Agenda
        btAgenda.setOnClickListener {
            val intent = Intent(this, AgendaActivity::class.java)
            startActivity(intent)
        }
        //Evento botón para abrir la Receta
        btReceta.setOnClickListener {
            val intent = Intent(this, RecetaActivity::class.java)
            startActivity(intent)
        }
    }
}