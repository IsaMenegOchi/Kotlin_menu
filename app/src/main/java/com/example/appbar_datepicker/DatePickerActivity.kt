package com.example.appbar_datepicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

class DatePickerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        supportActionBar!!.title= "Testando menu"
        supportActionBar!!.subtitle = "Aprendendo a lidar com os menus"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        //quem é o menu e o menu
        menuInflater.inflate(R.menu.menu_teste, menu)
        return true
    }
}