package jp.techacademy.yoshifumi.nishida.aisatsuapp

import android.os.Bundle
import android.view.View
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import android.app.TimePickerDialog

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)

    }

    override fun onClick(v: View) {

        if (v.id == R.id.button1) {
            showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
                this,

                TimePickerDialog.OnTimeSetListener { view, hour, minute ->

                    if (hour in 2..9) {

                        textView.text = "おはよう"

                    } else if (hour in 10..17) {

                        textView.text = "こんにちは"

                    } else if (hour in 18 downTo 1) {

                        textView.text = "こんばんは"
                    }
                },
                13,0,true)

        timePickerDialog.show()

    }
}


