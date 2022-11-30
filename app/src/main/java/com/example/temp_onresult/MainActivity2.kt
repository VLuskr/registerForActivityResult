package com.example.temp_onresult

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.temp_onresult.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("key10")
        binding.button.text = name

    }

    fun onClick(view: View) {
        val i = Intent()
        i.putExtra("key1", "done")
        setResult(RESULT_OK, i)
        finish()
    }
}