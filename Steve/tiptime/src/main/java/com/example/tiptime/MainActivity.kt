package com.example.tiptime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tiptime.databinding.ActivityMainBinding
import java.text.NumberFormat
import kotlin.math.ceil
import kotlin.math.round

class MainActivity : AppCompatActivity() {
    // 绑定对象实例， 可以访问activity——main.xml 布局中的视图
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.button.setOnClickListener{
            calculateTip()
        }
        displayTip(0.0)
    }

    private fun calculateTip() {
        val inputAmount = binding.costOfServiceEditText.text.toString()
        val cost = inputAmount.toDoubleOrNull()
        if (cost == null) {
//            binding.textView2.text = "0.0"
            displayTip(0.0)
            return
        }

        val tipPercentage = when(binding.radioGroup.checkedRadioButtonId) {
            R.id.radioButton  -> 0.21
            R.id.radioButton2  -> 0.16
            else  -> 0.10
        }

        var tip = cost * tipPercentage

        if (binding.switch1.isChecked) {
            tip = ceil(tip)
        }

//        binding.textView2.text = tip.toString()
        displayTip(tip)

//        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
//        binding.textView2.text = getString(R.string.tip_amount, formattedTip)


    }

    fun displayTip(tip: Double) {

        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        binding.textView2.text = getString(R.string.tip_amount, formattedTip)
    }
}