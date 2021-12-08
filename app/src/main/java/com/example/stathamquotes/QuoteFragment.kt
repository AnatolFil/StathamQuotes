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
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        quoteRecyclerView.adapter = QuoteAdapter(getQuotes())

        return view
    }

    private fun getQuotes(): List<Quote> {
        return listOf(
            Quote("\"Если закрыть глаза - становится темно\" ©Джейсон Стэтхэм", R.drawable.s1),
            Quote("\"Когда меня рожали тогда собственно я и родился\" ©Джейсон Стэтхэм", R.drawable.s2),
            Quote("\"Я конечно не идеал, но и ты не шаурма\" ©Джейсон Стэтхэм", R.drawable.s3),
            Quote("\"Я знаю, что я ничего не знаю\" ©Джейсон Стэтхэм", R.drawable.s7),
            Quote("\"Поставьте 5, пожалуйста\" ©Джейсон Стэтхэм", R.drawable.s4),
            Quote("\"Машина без колес не едет\" ©Джейсон Стэтхэм", R.drawable.s5),
            Quote("\"Айфон для понтов, андроид для пацанов\" ©Джейсон Стэтхэм", R.drawable.s6),
            Quote("\"Завтра на физру\" ©Джейсон Стэтхэм", R.drawable.s7),
            Quote("\"Восемь - не девять\" ©Джейсон Стэтхэм", R.drawable.s8),
            Quote("\"Когда больно - болит\" ©Джейсон Стэтхэм", R.drawable.s9),
        )
    }
}