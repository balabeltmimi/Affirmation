package com.example.affirmation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmation.adapter.ItemAdapter
import com.example.affirmation.data.Datasource
import com.example.affirmation.databinding.ActivityAffirmationBinding

class AffirmationActivity : AppCompatActivity() {

    val binding: ActivityAffirmationBinding by lazy { ActivityAffirmationBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        val myDataset = Datasource().loadAffirmations()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        recyclerView.setHasFixedSize(true)
    }
}