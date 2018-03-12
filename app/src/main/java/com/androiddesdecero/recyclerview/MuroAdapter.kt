package com.androiddesdecero.recyclerview

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.list_item_muro.view.*
import java.io.File
import javax.xml.transform.Templates

/**
 * Created by albertopalomarrobledo on 9/3/18.
 */
class MuroAdapter(val muro: ArrayList<Muro>) :RecyclerView.Adapter<MuroAdapter.MuroViewHolder>() {

    override fun onBindViewHolder(holder: MuroViewHolder, position: Int) {
        val itemMuro = muro[position]
        holder.bindMuro(itemMuro)
    }

    override fun getItemCount(): Int {
        return muro.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MuroViewHolder {
        var layoutInflate = LayoutInflater.from(parent.context)
                .inflate(R.layout.list_item_muro, parent, false)
        
        when(viewType){
            0 -> layoutInflate = LayoutInflater.from(parent.context)
                    .inflate(R.layout.list_item_muro_first, parent, false)
            1 -> layoutInflate = LayoutInflater.from(parent.context)
                    .inflate(R.layout.list_item_muro, parent, false)
        }
        return MuroViewHolder(layoutInflate)
    }

    override fun getItemViewType(position: Int): Int{
        var viewType: Int = 1
        if(position == 0) viewType = 0
        return viewType
    }

    class MuroViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        fun bindMuro(muro1: Muro){
            itemView.setOnClickListener(){
                val intent = Intent(itemView.context, PostActivity::class.java)
                intent.putExtra(Constans.FOTO, muro1.foto)
                intent.putExtra(Constans.POST, muro1.post)
                itemView.context.startActivity(intent)
            }
            itemView.limFotoPost.setImageResource(muro1.foto)
            itemView.limTextPost.text = muro1.post
            itemView.limFotoUser.setImageResource(muro1.fotoUser)
            itemView.limNombreUser.text = muro1.nameUser
        }
    }
}