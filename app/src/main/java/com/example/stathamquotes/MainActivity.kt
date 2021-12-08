package com.example.stathamquotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private val LAST_SELECTED_ITEM = "last_item"
    private val QUOTE_FRAGMENT = QuoteFragment().javaClass.name
    private val ABOUT_FRAGMENT = AboutFragment().javaClass.name

    private lateinit var bottomNavigationView: BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        try {
            bottomNavigationView = findViewById(R.id.bottom_navigation)

            bottomNavigationView.setOnItemSelectedListener { item ->
                var fragment: Fragment? = null
                when (item.itemId) {
                    R.id.quotes_item -> {
                        fragment = QuoteFragment()
                    }
                    R.id.about_item -> {
                        fragment = AboutFragment()
                    }
                }
                replaceFragment(fragment!!)
                true
            }

            bottomNavigationView.selectedItemId =
                savedInstanceState?.getInt(LAST_SELECTED_ITEM) ?: R.id.quotes_item

        } catch (ex: Exception) {
            Log.d("BUG", ex.message.toString())
            Toast.makeText(this, "Упс!Ошибка! + ${ex.message.toString()}", Toast.LENGTH_LONG).show()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(LAST_SELECTED_ITEM, bottomNavigationView.selectedItemId)
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}