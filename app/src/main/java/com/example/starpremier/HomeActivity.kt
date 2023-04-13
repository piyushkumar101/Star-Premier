package com.example.starpremier

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner

class HomeActivity : AppCompatActivity() {
    private lateinit var spinner: Spinner
    private val links = arrayOf("Home", "Casting", "Premiers", "News", "Account", "Settings")

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        spinner = findViewById(R.id.spinner)
        spinner.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, links)
//        spinner.setSelection(0)
//        spinner.getItemAtPosition(0)
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                val selectedItem = parent.getItemAtPosition(position).toString()
                when (selectedItem) {
                    "Home" -> {
//                        val Intent1= Intent(this@HomeActivity,HomeActivity::class.java)
//
//                        startActivity(Intent1)



                    }
                    "Casting" -> {
                        val Intent2= Intent(this@HomeActivity,CastingActivity::class.java)
                        startActivity(Intent2)


                    }
                    "Premiers" -> {
                        val Intent3= Intent(this@HomeActivity,PremiersActivity::class.java)
                        startActivity(Intent3)

                    }
                    "News" -> {
                        val Intent4= Intent(this@HomeActivity,NewsActivity::class.java)
                        startActivity(Intent4)

                    }
                    "Account" -> {
                        val Intent5= Intent(this@HomeActivity,AccountActivity::class.java)
                        startActivity(Intent5)

                    }
                    "Settings" -> {
                        val Intent6= Intent(this@HomeActivity,SettingsActivity::class.java)
                        startActivity(Intent6)

                    }
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                println("Nothing has been selected Please Select one option")
            }
        }
    }
}