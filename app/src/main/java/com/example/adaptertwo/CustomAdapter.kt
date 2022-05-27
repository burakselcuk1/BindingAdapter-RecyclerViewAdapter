package com.example.adaptertwo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.adaptertwo.databinding.RowItemBinding

class CustomAdapter( val dataSet: ArrayList<Person>) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    private lateinit var binding: RowItemBinding

    class ViewHolder(var view: RowItemBinding) : RecyclerView.ViewHolder(view.root) {

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        binding = RowItemBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.view.resim = dataSet[position]
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size

}