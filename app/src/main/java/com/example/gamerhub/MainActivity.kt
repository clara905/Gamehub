package com.example.gamerhub

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.app.gamerhub.v1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Greeting
        binding.tvGreeting.text = "Hello Gamers"

        // Lokasi
        binding.tvLocation.text = "UPNVJ, Jakarta"

        // Hint search
        binding.etSearch.hint = "Cari top up, voucher, atau joki game..."
    }
}

