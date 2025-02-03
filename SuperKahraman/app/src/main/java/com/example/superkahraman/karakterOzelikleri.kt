package com.example.superkahraman

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.superkahraman.MySingleton.secilenKarakterDizisi
import com.example.superkahraman.databinding.ActivityKarakterOzelikleriBinding
import com.example.superkahraman.databinding.ActivityMainBinding

class karakterOzelikleri : AppCompatActivity() {

    private lateinit var binding: ActivityKarakterOzelikleriBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKarakterOzelikleriBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

      //  val adapterdenGelenIntent = intent
       //val secilenKarakter adapterdenGelenIntent.getSerializableExtra("secilenKarakter",KarmaKarakterler ::class.java)
       // val secilenKarakterler = adapterdenGelenIntent.getSerializableExtra("secilenKarakter") as KarmaKarakterler
        val secilenKarakter = MySingleton.secilenKarakterDizisi

        binding.imageView.setImageResource(secilenKarakterDizisi.gorsel)
        binding.isimTextView.text = secilenKarakterDizisi.isim
        binding.meslekTextView.text = secilenKarakterDizisi.meslek

        }

    }
