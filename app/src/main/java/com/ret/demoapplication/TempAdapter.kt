package com.ret.demoapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.ret.demoapplication.databinding.RowItemBinding

class TempAdapter : RecyclerView.Adapter<ItemHolder>() {


    val arrayList = arrayListOf<ChapterItemModel>()


    fun setList(itemList: ArrayList<ChapterItemModel>){
        this.arrayList.clear()
        this.arrayList.addAll(itemList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {

        val holder = ItemHolder(
            RowItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
        return holder
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val model = arrayList[position]
        holder.rowItemBinding.chapterItemModel = model
    }
}

class ItemHolder(val rowItemBinding: RowItemBinding) : RecyclerView.ViewHolder(rowItemBinding.root)
