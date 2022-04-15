package com.saico.componentesuitest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import com.saico.componentesuitest.util.showToast
import kotlinx.android.synthetic.main.activity_radio_buttont.*

class RadioButtontActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_buttont)
    }

    fun radioButtonClicked(view: android.view.View) {
        when (view.id) {
            R.id.radioButton1 -> { if (radioButton1.isChecked) this.showToast("RadioButton1 is checked") }
        }
    }

    fun answer(view: android.view.View) {
        if (!radioGroup.isSelected) {
            this.showToast("You have select one option")
        } else {
            when (radioGroup.checkedRadioButtonId) {
                R.id.radioButton1 -> this.showToast("Its Correct")
                R.id.radioButton2 -> this.showToast("Is not correct")
            }
        }
    }
}

