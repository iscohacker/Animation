package com.example.animation

import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.animation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val anim = AnimationUtils.loadAnimation(this, R.anim.anim_alpha)
        binding.tvAlpha.setOnClickListener {
            binding.tvAlpha.startAnimation(anim)
        }
        val anim2 = AnimationUtils.loadAnimation(this, R.anim.anim_scale)
        binding.tvScale.setOnClickListener {
            binding.tvScale.startAnimation(anim2)
        }
        val anim3 = AnimationUtils.loadAnimation(this, R.anim.anim_translete)
        binding.tvTranslete.setOnClickListener {
            binding.tvTranslete.startAnimation(anim3)
        }
        val anim4 = AnimationUtils.loadAnimation(this, R.anim.anim_rotate)
        binding.tvRotate.setOnClickListener {
            binding.tvRotate.startAnimation(anim4)
        }
        val anim5 = AnimationUtils.loadAnimation(this, R.anim.anim_combinatrion)
        binding.tvCombinate.setOnClickListener {
            binding.tvCombinate.startAnimation(anim5)
        }

    }
}