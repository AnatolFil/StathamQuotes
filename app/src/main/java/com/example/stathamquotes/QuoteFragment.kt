package com.example.stathamquotes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class QuoteFragment : Fragment() {

    private lateinit var quoteRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_qoute_fragment, container, false)

        quoteRecyclerView = view.findViewById(R.id.quotes_recycler_view)

        quoteRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        quoteRecyclerView.adapter = QuoteAdapter(getQuotes())

        return view
    }

    private fun getQuotes(): List<Quote> {
        return listOf(
            Quote("Если закрыть глаза - становится темно", R.drawable.s1),
            Quote("Когда меня рожали тогда собственно я и родился", R.drawable.s2),
            )
    }

}