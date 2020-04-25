package net.nahuelberardi.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class SecondaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seconda)

        val nota = intent.getStringExtra("Nota")
        var txtNota = findViewById<TextView>(R.id.txtNotaSeconda).apply {
            text = nota
        }
    
    }
}
