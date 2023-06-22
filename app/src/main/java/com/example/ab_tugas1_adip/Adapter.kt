package com.example.ab_tugas1_adip

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ab_tugas1_adip.databinding.RecycleViewBinding

class Adapter : RecyclerView.Adapter<Adapter.ViewHolderCustom>() {
    private var listData = ArrayList<RecyclerViewItemModel>()

    fun isiList(listItem: ArrayList<RecyclerViewItemModel>){
        listData.clear()
        listData.addAll(listItem)
    }


    inner class ViewHolderCustom(private val binding: RecycleViewBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindData(item: RecyclerViewItemModel) {
            with(binding){
                Glide.with(itemView.context).load(item.image).into(gambarItem)
                judulItem.text = item.tvName
                deskripsiItem.text = item.tvDescription
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderCustom {
        return ViewHolderCustom(
            RecycleViewBinding.inflate(
                LayoutInflater.from(parent.context),parent,false
            )
        )

    }

    override fun getItemCount(): Int {
        return listData.size
    }

    override fun onBindViewHolder(holder: ViewHolderCustom, position: Int) {
        holder.bindData(listData[position])
    }
}
