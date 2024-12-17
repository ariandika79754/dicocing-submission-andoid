package com.hardeka.dicoding

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListBelajarAdapter(private val listBelajar: ArrayList<BelajarLang>) : RecyclerView.Adapter<ListBelajarAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_list, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val context = holder.itemView.context
        val belajarLang = listBelajar[position]
        Glide.with(holder.itemView.context)
            .load(belajarLang.pic1)
            .apply(RequestOptions())
            .into(holder.picture)
        holder.name.text = belajarLang.name
        holder.usefor.text = belajarLang.usefor
        holder.device.text = belajarLang.device
        holder.itemView.setOnClickListener{
            val passItem = Intent(context, DetailActivity::class.java)
            passItem.putExtra(DetailActivity.EXTRA_NAME, belajarLang.name)
            passItem.putExtra(DetailActivity.EXTRA_USEFOR, belajarLang.usefor)
            passItem.putExtra(DetailActivity.EXTRA_DEVICE, belajarLang.device)
            passItem.putExtra(DetailActivity.EXTRA_EXPLAIN, belajarLang.explain)
            passItem.putExtra(DetailActivity.EXTRA_YEAR, belajarLang.year)
            passItem.putExtra(DetailActivity.EXTRA_LAPTOP, belajarLang.laptop)
            passItem.putExtra(DetailActivity.EXTRA_PIC1, belajarLang.pic1)
            passItem.putExtra(DetailActivity.EXTRA_PICBG, belajarLang.background)
            passItem.putExtra(DetailActivity.EXTRA_PIC2, belajarLang.pic2)
            passItem.putExtra(DetailActivity.EXTRA_LINK, belajarLang.belajarlink)
            context.startActivity(passItem)
        }
    }

    override fun getItemCount(): Int {
        return listBelajar.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView = itemView.findViewById(R.id.belajar_name)
        var usefor: TextView = itemView.findViewById(R.id.belajar_usefor)
        var device: TextView = itemView.findViewById(R.id.belajar_device)
        var picture: ImageView = itemView.findViewById(R.id.belajar_picrow)
    }
}