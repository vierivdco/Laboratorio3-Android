package com.saico.componentesuitest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_switch_button.*

class SwitchButtonActivity : AppCompatActivity() {

    val switchOn = "Switch is ON"
    val switchOff = "Switch is OF"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_switch_button)

        switchButton.setOnCheckedChangeListener { view, isChecked ->
            when (isChecked) {
                true -> textView.text = switchOn
                false -> textView.text = switchOff
            }
        }

        switchButton.isChecked = true
        when (switchButton.isChecked) {
            true -> textView.text = switchOn
            false -> textView.text = switchOff
        }
    }


}