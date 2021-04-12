package com.example.recyclerview.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerview.model.Tinh
import kotlinx.android.synthetic.main.item_layout.view.*

class ViewProvinceHolder(
    itemView: View,
    private val onItemClick: (Tinh) -> Unit
) : RecyclerView.ViewHolder(itemView) {

    fun bindData(tinh: Tinh) {
        itemView.apply {
            Glide.with(context)
                .load(tinh.image)
                .into(image)
            textName.text = tinh.name
            textPopulation.text = tinh.population
            setOnClickListener {
                onItemClick(tinh)
            }
        }
    }
}
