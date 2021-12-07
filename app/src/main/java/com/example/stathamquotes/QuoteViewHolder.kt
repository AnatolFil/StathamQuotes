package com.example.stathamquotes

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class QuoteViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    private val quoteTextView:TextView = itemView.findViewById(R.id.quote_text_view)
    private val quoteImgView:ImageView = itemView.findViewById(R.id.quote_img_view)

    fun bind(quote:Quote){
        quoteTextView.text = quote.text
        quoteImgView.setImageResource(quote.img)
    }
}