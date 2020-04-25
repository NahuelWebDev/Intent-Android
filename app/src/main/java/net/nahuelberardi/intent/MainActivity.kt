    package net.nahuelberardi.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var nota : String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txtNota = findViewById<EditText>(R.id.txtNota)
        var btnSalva = findViewById<Button>(R.id.btnSalva)

        btnSalva.setOnClickListener(View.OnClickListener { v ->
            if (!txtNota.text.toString().isNullOrEmpty()) {
                nota = txtNota.text.toString()
                var intent = Intent(this, SecondaActivity::class.java).apply {
                    putExtra("Nota", nota)
                }
                startActivity(intent)
            } else {
                Toast.makeText(this,"Inserire del testo",Toast.LENGTH_SHORT).show()
            }
        })


    }
}
