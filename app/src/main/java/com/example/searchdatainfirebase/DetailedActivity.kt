package com.example.searchdatainfirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.searchdatainfirebase.databinding.ActivityDetailedBinding

class DetailedActivity : AppCompatActivity() {

    var imageUrl = ""
    private lateinit var binding: ActivityDetailedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailedBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras
        if (bundle!=null){
            binding.detailDesc.text = bundle.getString("Description")
            binding.detailTitle.text = bundle.getString("Title")
            binding.detailPriority.text = bundle.getString("Priority")
            imageUrl = bundle.getString("Image")!!

            Glide.with(this).load(bundle.getString("Image")).into(binding.detailImage)
        }
    }
}