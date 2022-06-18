package com.krypton_byte.tasbih

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import io.alterac.blurkit.BlurLayout


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val label:TextView = findViewById(R.id.CurrentAmount)
        val hit = findViewById<BlurLayout>(R.id.hit)
        val reset = findViewById<BlurLayout>(R.id.reset)
        hit.setOnClickListener{
            val curtext: String = label.text.toString()
            val cal: Int = curtext.toInt() + 1
            label.text = cal.toString()
        }
        reset.setOnClickListener{
            val alert = AlertDialog.Builder(this)
            alert.setTitle("Apakah Anda Yakin?")
            alert.setPositiveButton("Ya", DialogInterface.OnClickListener{dialogInterface, i ->
                label.text = "0"
                Toast.makeText(this,"Berhasil Di reset", Toast.LENGTH_LONG).show()
            })
            alert.setCancelable(true)
            alert.show()
        }
    }
}