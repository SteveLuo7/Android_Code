package com.example.calculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var resultTextView: TextView
    private var operand: Double = 0.0
    private var operation: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView = findViewById(R.id.resultTextView)

        val button0: Button = findViewById(R.id.button0)
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val button4: Button = findViewById(R.id.button4)
        val button5: Button = findViewById(R.id.button5)
        val button6: Button = findViewById(R.id.button6)
        val button7: Button = findViewById(R.id.button7)
        val button8: Button = findViewById(R.id.button8)
        val button9: Button = findViewById(R.id.button9)
        val buttonDot: Button = findViewById(R.id.buttonDot)

        val buttonEquals: Button = findViewById(R.id.buttonEquals)
        val buttonPlus: Button = findViewById(R.id.buttonPlus)
        val buttonMinus: Button = findViewById(R.id.buttonMinus)
        val buttonMultiply: Button = findViewById(R.id.buttonMultiply)
        val buttonDivide: Button = findViewById(R.id.buttonDivide)

        val buttonClear: Button = findViewById(R.id.buttonClear)

        val listener = View.OnClickListener { v ->
            val b = v as Button
            when (b.id) {
                R.id.button0 -> numberClicked("0")
                R.id.button1 -> numberClicked("1")
                R.id.button2 -> numberClicked("2")
                R.id.button3 -> numberClicked("3")
                R.id.button4 -> numberClicked("4")
                R.id.button5 -> numberClicked("5")
                R.id.button6 -> numberClicked("6")
                R.id.button7 -> numberClicked("7")
                R.id.button8 -> numberClicked("8")
                R.id.button9 -> numberClicked("9")
                R.id.buttonDot -> numberClicked(".")
                R.id.buttonPlus -> operationClicked("+")
                R.id.buttonMinus -> operationClicked("-")
                R.id.buttonMultiply -> operationClicked("*")
                R.id.buttonDivide -> operationClicked("/")
                R.id.buttonClear -> clearClicked()
                R.id.buttonEquals -> equalsClicked()
            }
        }

        button0.setOnClickListener(listener)
        button1.setOnClickListener(listener)
        button2.setOnClickListener(listener)
        button3.setOnClickListener(listener)
        button4.setOnClickListener(listener)
        button5.setOnClickListener(listener)
        button6.setOnClickListener(listener)
        button7.setOnClickListener(listener)
        button8.setOnClickListener(listener)
        button9.setOnClickListener(listener)
        buttonDot.setOnClickListener(listener)

        buttonEquals.setOnClickListener(listener)
        buttonPlus.setOnClickListener(listener)
        buttonMinus.setOnClickListener(listener)
        buttonMultiply.setOnClickListener(listener)
        buttonDivide.setOnClickListener(listener)

        buttonClear.setOnClickListener(listener)
    }

    private fun numberClicked(number: String) {
        val currentText = resultTextView.text.toString()
        resultTextView.text = currentText + number
    }

    private fun operationClicked(operation: String) {
        if (operand == 0.0) {
            operand = resultTextView.text.toString().toDouble()
        }
        this.operation = operation
        resultTextView.text = ""
    }

    private fun equalsClicked() {
        val secondOperandText = resultTextView.text.toString()
        val secondOperand = secondOperandText.toDouble()
        var result = 0.0
        when (operation) {
            "+" -> result = operand + secondOperand
            "-" -> result = operand - secondOperand
            "*" -> result = operand * secondOperand
            "/" -> result = operand / secondOperand
        }
        resultTextView.text = result.toString()
        operand = 0.0
        operation = ""
    }

    private fun clearClicked() {
        resultTextView.text = ""
        operand = 0.0
        operation = ""
    }
}
