package com.example.stathamquotes

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class AboutFragment : Fragment() {

    private lateinit var visitSiteButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_about, container, false)

        visitSiteButton = view.findViewById(R.id.visit_site_button)

        visitSiteButton.setOnClickListener{
            val link = Uri.parse("https://ru.wikipedia.org/wiki/Стейтем,_Джейсон")
            val intent = Intent(Intent.ACTION_VIEW, link)
            context?.startActivity(intent)
        }

        return view
    }

}