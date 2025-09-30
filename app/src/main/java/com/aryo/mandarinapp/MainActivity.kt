package com.aryo.mandarinapp

import android.content.ActivityNotFoundException
import android.content.Context
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.content.Intent
import android.net.Uri
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var btnBukaMaps: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnDewasa = findViewById<Button>(R.id.btnDewasa)
        val btnAnak = findViewById<Button>(R.id.btnAnak)
        val btnPerpus = findViewById<Button>(R.id.btnPerpus)
        val btnJadwal = findViewById<Button>(R.id.btnJadwal)
        val btnSemuaMentor = findViewById<Button>(R.id.btnSemuaMentor)
        val btnDaring = findViewById<Button>(R.id.btnDaring)
        val btnPrivate = findViewById<Button>(R.id.btnPrivate)
//        val btnTelpon = findViewById<Button>(R.id.btnTelpon)



        btnDewasa.setOnClickListener {
            val intent = Intent(this, dewasa::class.java)
            startActivity(intent)
        }

        btnAnak.setOnClickListener {
            Toast.makeText(this, "Masih masa pengembangan", Toast.LENGTH_SHORT).show()
        }

        btnPrivate.setOnClickListener {
            Toast.makeText(this, "Masih masa pengembangan", Toast.LENGTH_SHORT).show()
        }

        btnPerpus.setOnClickListener {
            val intent = Intent(this, Perpustakaan::class.java)
            startActivity(intent)
        }

        btnJadwal.setOnClickListener {
            val intent = Intent(this, JadwalBiaya::class.java)
            startActivity(intent)
        }

        btnSemuaMentor.setOnClickListener {
            val intent = Intent(this, Mentor::class.java)
            startActivity(intent)
        }

        btnDaring.setOnClickListener {
            val intent = Intent(this, DetailKelasOnline::class.java)
            startActivity(intent)
        }

//        btnTelpon.setOnClickListener {
//            val intent = Intent(Intent.ACTION_DIAL)
//            intent.data = Uri.parse("tel:085158335498")
//            startActivity(intent)
//        }

        btnBukaMaps = findViewById(R.id.btnBukaMaps)
        btnBukaMaps.setOnClickListener {
            val lat = 3.2722597235904787
            val lng = 99.36761243318571
            openGoogleMapWithCoordinates(this, lat, lng)
        }

    }

    private fun openGoogleMapWithCoordinates(context: Context, lat: Double, lng: Double) {
        val uri = Uri.parse("google.navigation:q=$lat,$lng&mode=d")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        intent.setPackage("com.google.android.apps.maps")

        try {
            context.startActivity(intent)
        } catch (e: ActivityNotFoundException) {
                Toast.makeText(context, "TIDAK TERSEDIA DI GOOGLE MAPS", Toast.LENGTH_LONG).show()
        }
    }
}