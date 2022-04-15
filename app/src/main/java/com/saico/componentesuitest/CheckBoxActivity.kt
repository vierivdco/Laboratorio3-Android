package com.saico.componentesuitest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_check_box.*

class CheckBoxActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)

        checkBox.isChecked = true

        if (checkBox.isChecked) Toast.makeText(this, "First checkbox is checked!", Toast.LENGTH_SHORT).show()
    }

    fun androidCheckBoxClicked(view: android.view.View) {
        // action for checkbox click
        when (view.id) {
            R.id.checkBox -> { Toast.makeText(this, "CheckBox is checked", Toast.LENGTH_SHORT).show() }
        }
    }
}