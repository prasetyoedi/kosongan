package com.example.tugasintentpertemuan5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugasintentpertemuan5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivityLifecycle"
    private lateinit var binding: ActivityMainBinding

    companion object {
        const val EXTRA_USERNAME = "extra_username"
        const val EXTRA_EMAIL = "extra_email"
        const val EXTRA_PHONE = "extra_phone"
        const val EXTRA_PASSWORD = "extra_password"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            regisBtn.setOnClickListener {
                val intentSecond = Intent(this@MainActivity, SecondActivity::class.java)
                intentSecond.putExtra(EXTRA_USERNAME, edtUsername.text.toString())
                intentSecond.putExtra(EXTRA_EMAIL, edtEmail.text.toString())
                intentSecond.putExtra(EXTRA_PHONE, edtPhone.text.toString())
                intentSecond.putExtra(EXTRA_PASSWORD, edtPass.text.toString())
                startActivity(intentSecond)
            }

            loginlink.setOnClickListener {
                val intentThird = Intent(this@MainActivity, ThirdActivity::class.java)
                startActivity(intentThird)
            }
        }
    }
}