package com.example.tugasintentpertemuan5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugasintentpertemuan5.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username1 = intent.getStringExtra(MainActivity.EXTRA_USERNAME)
        val email1 = intent.getStringExtra(MainActivity.EXTRA_EMAIL)
        val phone1 = intent.getStringExtra(MainActivity.EXTRA_PHONE)
        with(binding) {
            username.text = username1
            email.text = email1
            phone.text = phone1
        }
    }
}