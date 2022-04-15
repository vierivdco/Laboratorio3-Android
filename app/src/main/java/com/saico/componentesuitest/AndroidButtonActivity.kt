package com.saico.componentesuitest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.saico.componentesuitest.util.showToast
import com.saico.componentesuitest.util.showToastLong
import kotlinx.android.synthetic.main.activity_android_button.*

class AndroidButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_button)

        btnSimpleButton.setOnClickListener {

        }
    }

    fun callSimpleButton(view: android.view.View) {
        this.showToast("Click Simple Button")
        this.showToastLong("qjwleqwjelq")
    }
}