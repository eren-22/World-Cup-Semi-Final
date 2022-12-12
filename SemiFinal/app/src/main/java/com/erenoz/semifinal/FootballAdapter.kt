package com.erenoz.semifinal

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.erenoz.semifinal.databinding.ActivityDetailsBinding
import com.erenoz.semifinal.databinding.RecyclerRowBinding

class FootballAdapter(val footballList: ArrayList<Football>) : RecyclerView.Adapter<FootballAdapter.FootballHolder>() {
    class FootballHolder (val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FootballHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context) , parent , false)
        return FootballHolder(binding)
    }

    override fun onBindViewHolder(holder: FootballHolder, position: Int) {
        holder.binding.recyclerViewImageView.setImageResource(footballList.get(position).flagImage)
        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context , DetailsActivity::class.java)
            intent.putExtra("football" , footballList.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return footballList.size
    }
}