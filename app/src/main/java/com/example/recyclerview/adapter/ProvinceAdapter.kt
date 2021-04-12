package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.model.Tinh

class ProvinceAdapter(private val onClickItem: (Tinh) ->Unit) :
    RecyclerView.Adapter<ViewProvinceHolder>() {

    private val listProvince = mutableListOf<Tinh>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewProvinceHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)
        return ViewProvinceHolder(view, onClickItem)
    }

    override fun onBindViewHolder(holder: ViewProvinceHolder, position: Int) {
        holder.bindData(listProvince[position])
    }

    override fun getItemCount(): Int = listProvince.size

    fun updataData(list: MutableList<Tinh>?){
        list?.let {
            listProvince.clear()
            listProvince.addAll(it)
            notifyDataSetChanged()
        }
    }
}
