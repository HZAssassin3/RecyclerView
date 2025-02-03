package com.example.superkahraman

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.superkahraman.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var karmaKarakterlerListesi: ArrayList<KarmaKarakterler>
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Listeyi başlat
        karmaKarakterlerListesi = arrayListOf()

        val Joel = KarmaKarakterler("Joel", "İnfazcı", R.drawable.basaasa)
        val Ellie = KarmaKarakterler("Ellie", "Masum", R.drawable.aloneellie)
        val Tommy = KarmaKarakterler("Tommy", "Sport", R.drawable.atussu)
        val Adam = KarmaKarakterler("Ryan Gosling", "Aktör", R.drawable.ryangosling)
        val Jinx = KarmaKarakterler("The Last Of Uf Part-1", "Deli", R.drawable.thelastofus)
        val Violet = KarmaKarakterler("Violet", "Ormancı", R.drawable.elijoelebakarken)
        val Vayne = KarmaKarakterler("Vayne", "Nişancı", R.drawable.dagmanzara)
        val Caitlin = KarmaKarakterler("Caitlin", "Devriye", R.drawable.manzaraciddenefsane)
        val Lux = KarmaKarakterler("Lux", "Büyücü", R.drawable.indir)
        val Mordekaiser = KarmaKarakterler("Mordekaiser", "Duellocu", R.drawable.indir2)
        val Garen = KarmaKarakterler("Garen", "Damacia", R.drawable.indir3)
        val Darius = KarmaKarakterler("Darius", "Noxus", R.drawable.indir4)

        // Listeye eleman ekle
        karmaKarakterlerListesi.addAll(
            listOf(
                Joel,
                Ellie,
                Tommy,
                Adam,
                Jinx,
                Violet,
                Vayne,
                Caitlin,
                Lux,
                Mordekaiser,
                Garen,
                Darius
            )
        )
        karmaKarakterlerListesi.add(Darius)
        karmaKarakterlerListesi.add(Darius)
        karmaKarakterlerListesi.add(Darius)
        karmaKarakterlerListesi.add(Darius)

        val adapter = karmaKarakterlerAdapter(karmaKarakterlerListesi)
        binding.KarmaKarakterlerRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.KarmaKarakterlerRecyclerView.adapter = adapter
    }
}