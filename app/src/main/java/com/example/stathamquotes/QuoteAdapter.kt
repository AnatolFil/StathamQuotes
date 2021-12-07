package com.example.stathamquotes

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView

class QuoteAdapter(private val quoteList: List<Quote>) : RecyclerView.Adapter<QuoteViewHolder>() {
    override fun onBindViewHolder(holder: QuoteViewHolder, position: Int) {
        holder.bind(quoteList[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuoteViewHolder {
        val itemView = QuoteViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.quote_list_item, parent, false))

        return itemView

    }

    override fun getItemCount(): Int {
        return quoteList.size
    }


}