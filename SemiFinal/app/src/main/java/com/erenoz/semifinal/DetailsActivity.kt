package com.erenoz.semifinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.erenoz.semifinal.databinding.ActivityDetailsBinding
import com.erenoz.semifinal.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent

        val selectedFootballList = intent.getSerializableExtra("football") as Football

        binding.imageView.setImageResource(selectedFootballList.flagImage)
        binding.imageView.setImageResource(selectedFootballList.playerImage)
        binding.nameText.text = selectedFootballList.name
    }
}