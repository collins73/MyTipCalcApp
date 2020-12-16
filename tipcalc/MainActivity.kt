package com.myapp.tipcalc

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AutoCompleteTextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        infoTextView.visibility = View.INVISIBLE
        calculateButton.setOnClickListener {

                val bill = billEditText.text.toString().toDouble()
                val tipPercentage = tipPercentageEditText.text.toString().toDouble()
                val tip = bill * (tipPercentage / 100)
                val total = tip + bill

         infoTextView.visibility = View.VISIBLE

         infoTextView.text = "Tip: \$${doubleToDollar(tip)} Total: \$${doubleToDollar(total)}"


         resetButton.setOnClickListener {
             infoTextView.visibility = View.INVISIBLE
         }



        }

    }

    private fun doubleToDollar(number:Double): String {
        return "$" + String.format("%.2f", number)
    }
}


