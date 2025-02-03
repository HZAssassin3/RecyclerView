package com.example.superkahraman

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.superkahraman.databinding.RecyclerRowBinding

class karmaKarakterlerAdapter(val karmaKarakterlerListesi: ArrayList<KarmaKarakterler>) : RecyclerView.Adapter<karmaKarakterlerAdapter.karmaKarakterlerViewHolder>() {

    class karmaKarakterlerViewHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): karmaKarakterlerViewHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return karmaKarakterlerViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return karmaKarakterlerListesi.size
    }

    override fun onBindViewHolder(holder: karmaKarakterlerViewHolder, position: Int) {
        holder.binding.textViewRecyclerView.text = karmaKarakterlerListesi[position].isim
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,karakterOzelikleri ::class.java)
            MySingleton.secilenKarakterDizisi = karmaKarakterlerListesi[position]
            //intent.putExtra("secilenKarakter",karmaKarakterlerListesi [position])
            holder.itemView.context.startActivity(intent)
        }
    }
}