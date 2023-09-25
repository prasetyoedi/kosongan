package com.example.tugasintentpertemuan5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugasintentpertemuan5.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding
    private val TAG = "MainActivityLifecycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding= ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            loginBtn.setOnClickListener{
                val firstintent = Intent(this@ThirdActivity, SecondActivity::class.java)
                startActivity(firstintent)
            }

            regsiter2.setOnClickListener{
                val secondintent = Intent(this@ThirdActivity, MainActivity::class.java)
                startActivity(secondintent)
            }
        }
    }
}