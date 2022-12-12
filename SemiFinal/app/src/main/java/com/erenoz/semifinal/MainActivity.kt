package com.erenoz.semifinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.erenoz.semifinal.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var footballList : ArrayList<Football>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        wcText.text = "Qatar 2022 World Cup Semi-Final"

        footballList = ArrayList<Football>()

        val argentina = Football(R.drawable.argentina , "Messi" , R.drawable.messi)
        val crotia = Football(R.drawable.crotia , "Modric" , R.drawable.modric)
        val france = Football(R.drawable.france , "Mbappe" , R.drawable.mbappe)
        val morocco = Football(R.drawable.morocco, "Hakimi" , R.drawable.hakimi)

        footballList.add(argentina)
        footballList.add(crotia)
        footballList.add(france)
        footballList.add(morocco)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val footballAdapter = FootballAdapter(footballList)
        binding.recyclerView.adapter = footballAdapter
    }
}