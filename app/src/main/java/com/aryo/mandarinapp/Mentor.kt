package com.aryo.mandarinapp

import android.content.ActivityNotFoundException
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.net.Uri
import android.widget.ImageView

class Mentor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_mentor)

        val btnWhatsapp = findViewById<ImageView>(R.id.ic_whatsappAryo)
        val noHp = "6282161965317"
        val teks = "Halo, saya ingin menanyakan mentor Mandarin App"
        btnWhatsapp.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://wa.me/$noHp?text=$teks")
            startActivity(intent)
        }

        val btnInstagram = findViewById<ImageView>(R.id.ic_instagramAryo)
        btnInstagram.setOnClickListener {
            val akunInstagram = Uri.parse("https://www.instagram.com/aryopratamaa")
            val intent = Intent(Intent.ACTION_VIEW, akunInstagram)
            intent.setPackage("com.instagram.android")
            try {
                startActivity(intent)
            } catch (e: ActivityNotFoundException) {
                startActivity(Intent(Intent.ACTION_VIEW, akunInstagram)
                )
            }
        }

        val btnFacebook = findViewById<ImageView>(R.id.ic_fbAryo)
        btnFacebook.setOnClickListener {
            val akunFacebook = Uri.parse("https://www.facebook.com/aryopratama04082000")
            val intent = Intent(Intent.ACTION_VIEW, akunFacebook)
            intent.setPackage("com.facebook.android")
            try {
                startActivity(intent)
            } catch (e: ActivityNotFoundException) {
                startActivity(Intent(Intent.ACTION_VIEW, akunFacebook)
                )
            }

        }

        val btnYoutube = findViewById<ImageView>(R.id.ic_youtubeAryo)
        btnYoutube.setOnClickListener {
            val akunYoutube = Uri.parse("https://www.youtube.com/@mistergoyo")
            val intent = Intent(Intent.ACTION_VIEW, akunYoutube)
            intent.setPackage("com.google.android.youtube")
            try {
                startActivity(intent)
            } catch (e: ActivityNotFoundException) {
                startActivity(Intent(Intent.ACTION_VIEW, akunYoutube)
                )
            }
        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}