package com.saico.componentesuitest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import kotlinx.android.synthetic.main.activity_seek_bar.*
import android.widget.Toast
import com.saico.componentesuitest.util.showToast


class SeekBarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seek_bar)

        seekBar.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
            override fun onStopTrackingTouch(seekBar: SeekBar) {
                showToast("SeekBar Touch Stop")
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                showToast("SeekBar Touch Started")
            }

            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                count.text = "Progress:  $progress / ${seekBar.max}"
                showToast("SeekBar Progress Change")
            }
        })
    }
}