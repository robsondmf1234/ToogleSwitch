package com.example.toogleeswitch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.TextView
import android.widget.Toast
import android.widget.ToggleButton
import androidx.appcompat.widget.SwitchCompat

class MainActivity : AppCompatActivity() {

    private lateinit var switchSenha: SwitchCompat
    private lateinit var toggleSenha: ToggleButton
    private lateinit var enviar: Button
    private lateinit var textResultado: TextView
    private lateinit var checkBoxSenha:CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        switchSenha     = findViewById(R.id.switchSenha)
        toggleSenha     = findViewById(R.id.toggleSenha)
        enviar          = findViewById(R.id.buttonEnviar)
        textResultado   = findViewById(R.id.textResultado)
        checkBoxSenha   = findViewById(R.id.checkboxSenha)

        //Chamado os métodos listeners
        listenerSwitch()
        listernerToggle()
        listenerCheckBox()
    }

    //Listener para o componente Checkbox
    fun listenerCheckBox(){
        checkBoxSenha.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { compoundButton, b ->
            if (b) {
                textResultado.text ="Checkbox senha ativado"
            } else textResultado.text = "Checkbox senha desativado"

        })
    }

    //Listener para o componente Switch
    fun listenerSwitch() {
        switchSenha.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { compoundButton, b ->
            if (b) {
                textResultado.text ="Lembrar senha ativado"
            } else textResultado.text = "Lembrar senha desativado"

        })
    }

    //Listener para o componente Toggle
    fun listernerToggle(){
        toggleSenha.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { compoundButton, b ->
            if (b) {
                textResultado.setText("Toogle senha ativado")
            } else textResultado.setText("Toggle senha desativado")
        })
    }

    fun enviar(view: View) {

       //verficarToggle()

        //verificarSwitch()

        //verificarCheckBox()
    }

    private fun verificarSwitch() {
        if (switchSenha.isChecked) {
            textResultado.setText("Lembrar senha ativado")
            //            Toast.makeText(this, "Lembrar senha ativado", Toast.LENGTH_SHORT).show()
        } else textResultado.setText("Lembrar senha desativado")
        //        Toast.makeText(this, "Lembrar senha desativado", Toast.LENGTH_SHORT).show()
    }

    private fun verficarToggle() {
        if (toggleSenha.isChecked) {
            textResultado.setText("Toogle senha ativado")
        } else textResultado.setText("Toggle senha desativado")
    }

    private fun verificarCheckBox(){
        if (checkBoxSenha.isChecked){
            textResultado.text = "Lembrar senha ativado"
        }else textResultado.text = "Lembrar senha desativado"
    }
}