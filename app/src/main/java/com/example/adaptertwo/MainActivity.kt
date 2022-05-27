package com.example.adaptertwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.adaptertwo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: CustomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val a = Person("https://i.ytimg.com/vi/3t1nl4IO7DM/maxresdefault.jpg")
        val b = Person("https://i0.wp.com/cembarut.com.tr/wp-content/uploads/PowerPoint-bir-Resmi-Kirpma-veya-Kesme_1-min.png?fit=484%2C363&ssl=1")

        val c = arrayListOf<Person>(a,b)

        adapter = CustomAdapter(c)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter
    }
}