package com.example.affirmation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.affirmation.data.Datasource
import com.example.affirmation.databinding.ActivityAffirmationBinding

class AffirmationActivity : AppCompatActivity() {

    val binding: ActivityAffirmationBinding by lazy { ActivityAffirmationBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textView: TextView = findViewById(R.id.textview)
        textView.text = Datasource().loadAffirmations().size.toString()
        setContentView(binding.root)
    }
}