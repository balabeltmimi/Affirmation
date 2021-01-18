package com.example.affirmation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.affirmation.databinding.ActivityAffirmationBinding

class AffirmationActivity : AppCompatActivity() {

    val binding: ActivityAffirmationBinding by lazy { ActivityAffirmationBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}