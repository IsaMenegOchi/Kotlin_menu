package com.example.appbar_datepicker

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.DatePicker
import android.widget.EditText
import android.widget.Toast
import java.util.*

class DatePickerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        supportActionBar!!.title= "Testando menu"
        supportActionBar!!.subtitle = "Aprendendo a lidar com os menus"

      //CRIAR A TELA
        val calendario = Calendar.getInstance()

      //DETERMINAR DADOS (dia, mes e ano) DO CALENDARIO
        val ano = calendario.get(Calendar.YEAR)
        val mes = calendario.get(Calendar.MONTH)

        //dia do mes é o dia mesmo, em numero
        //dia da semana é o nome do dia como segunda
        val dia = calendario.get(Calendar.DAY_OF_MONTH)

      //ABRIR O COMPONENTE DATE PICKER
        val etDataNasc = findViewById<EditText>(R.id.et_data)

        etDataNasc.setOnClickListener {
            val dp = DatePickerDialog(this,
                DatePickerDialog.OnDateSetListener {
                    //criamos a variavel que vai guardar o dia, mes e ano que clicamos
                    view, _ano, _mes, _dia -> etDataNasc.setText("$_dia/${_mes+1}/$_ano")} , ano, mes, dia)

            dp.show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        //quem é o menu e o menu
        menuInflater.inflate(R.menu.menu_teste, menu)
        return true
    }


    //ao selecionado um item das opções
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //Se o item do id for igual a Res.id.id_do_item
//            if(item.itemId == R.id.menu_save){
//                Toast.makeText(this, "Salvar", Toast.LENGTH_SHORT).show()
//            }
//            else if(item.itemId == R.id.menu_settings){
//                Toast.makeText(this, "Configuração", Toast.LENGTH_SHORT).show()
//            }
//            else if(item.itemId == R.id.menu_perfil){
//                Toast.makeText(this, "Perfil", Toast.LENGTH_SHORT).show()
//            }

        //valor que sera utilizado para comparação
        when (item.itemId){

            //se id for menu_seve então...
            R.id.menu_save -> {
                Toast.makeText(this, "Salvar", Toast.LENGTH_SHORT).show()
            }
            R.id.menu_settings -> {
                Toast.makeText(this, "Configurações", Toast.LENGTH_SHORT).show()
            }
            R.id.menu_perfil -> {
                Toast.makeText(this, "Perfil", Toast.LENGTH_SHORT).show()
            }
        }
        return true
    }
}