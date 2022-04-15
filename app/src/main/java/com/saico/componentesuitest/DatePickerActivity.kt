package com.saico.componentesuitest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import android.widget.DatePicker.OnDateChangedListener
import com.saico.componentesuitest.util.formatDate
import kotlinx.android.synthetic.main.activity_date_picker.*
import java.util.*

class DatePickerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_picker)

        datePicker.init(Calendar.YEAR, Calendar.MONTH, Calendar.DAY_OF_MONTH) { datePicker, year, month, dayOfMonth ->
            display_date.text = this.formatDate(dayOfMonth, month, year)
        }
    }

    fun pick(view: android.view.View) {
        display_date.text = this.formatDate(datePicker.dayOfMonth, datePicker.month, datePicker.year)
    }
}