package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val value = findViewById<EditText>(R.id.value)
        var firstValue = 0.0
        var operator = ""
        var result = 0.0
        var start = true
        var lastOperator = false
        val button_0 = findViewById<Button>(R.id.button_0)
        val button_1 = findViewById<Button>(R.id.button_1)
        val button_2 = findViewById<Button>(R.id.button_2)
        val button_3 = findViewById<Button>(R.id.button_3)
        val button_4 = findViewById<Button>(R.id.button_4)
        val button_5 = findViewById<Button>(R.id.button_5)
        val button_6 = findViewById<Button>(R.id.button_6)
        val button_7 = findViewById<Button>(R.id.button_7)
        val button_8 = findViewById<Button>(R.id.button_8)
        val button_9 = findViewById<Button>(R.id.button_9)
        val button_dot = findViewById<Button>(R.id.button_dot)
        val button_add = findViewById<Button>(R.id.button_add)
        val button_minus = findViewById<Button>(R.id.button_minus)
        val button_multiply = findViewById<Button>(R.id.button_multiply)
        val button_divide = findViewById<Button>(R.id.button_divide)
        val button_sqrt = findViewById<Button>(R.id.button_sqrt)
        val button_equalsTo = findViewById<Button>(R.id.button_equalsTo)
        button_0.setOnClickListener {
            if(lastOperator){
                lastOperator = false
                value.setText("0")
            }
            else
                value.setText(value.text.toString() + "0")
        }
        button_1.setOnClickListener {
            if(lastOperator){
                lastOperator = false
                value.setText("1")
            }
            else
                value.setText(value.text.toString() + "1")
        }
        button_2.setOnClickListener {
            if(lastOperator){
                lastOperator = false
                value.setText("2")
            }
            else
                value.setText(value.text.toString() + "2")
        }
        button_3.setOnClickListener {
            if(lastOperator){
                lastOperator = false
                value.setText("3")
            }
            else
                value.setText(value.text.toString() + "3")
        }
        button_4.setOnClickListener {
            if(lastOperator){
                lastOperator = false
                value.setText("4")
            }
            else
                value.setText(value.text.toString() + "4")
        }
        button_5.setOnClickListener {
            if(lastOperator){
                lastOperator = false
                value.setText("5")
            }
            else
                value.setText(value.text.toString() + "5")
        }
        button_6.setOnClickListener {
            if(lastOperator){
                lastOperator = false
                value.setText("6")
            }
            else
                value.setText(value.text.toString() + "6")
        }
        button_7.setOnClickListener {
            if(lastOperator){
                lastOperator = false
                value.setText("7")
            }
            else
                value.setText(value.text.toString() + "7")
        }
        button_8.setOnClickListener {
            if(lastOperator){
                lastOperator = false
                value.setText("8")
            }
            else
                value.setText(value.text.toString() + "8")
        }
        button_9.setOnClickListener {
            if(lastOperator){
                lastOperator = false
                value.setText("9")
            }
            else
                value.setText(value.text.toString() + "9")
        }
        button_dot.setOnClickListener {
            if(!value.text.contains("."))
                value.setText(value.text.toString() + ".")
        }
        button_add.setOnClickListener {
            val currentValue = value.text.toString().toDouble()
            lastOperator = true
            if(start){
                start = false
                firstValue = currentValue
                operator = "+"
            }
            else {
                if(operator.equals("+"))
                    result = firstValue + currentValue
                else if(operator.equals("-"))
                    result = firstValue - currentValue
                else if(operator.equals("*"))
                    result = firstValue * currentValue
                else if(operator.equals("/")) {
                    if(currentValue != 0.0)
                        result = firstValue / currentValue
                    else {
                        result = firstValue
                        Toast.makeText(this, "Divide By Zero not allowed", Toast.LENGTH_SHORT).show()
                    }
                }
                firstValue = result
                value.setText(result.toString())
            }
            operator = "+"
        }
        button_minus.setOnClickListener {
            val currentValue = value.text.toString().toDouble()
            lastOperator = true
            if(start){
                start = false
                firstValue = currentValue
                operator = "-"
            }
            else {
                if(operator.equals("+"))
                    result = firstValue + currentValue
                else if(operator.equals("-"))
                    result = firstValue - currentValue
                else if(operator.equals("*"))
                    result = firstValue * currentValue
                else if(operator.equals("/")) {
                    if(currentValue != 0.0)
                        result = firstValue / currentValue
                    else {
                        result = firstValue
                        Toast.makeText(this, "Divide By Zero not allowed", Toast.LENGTH_SHORT).show()
                    }
                }
                firstValue = result
                value.setText(result.toString())
                operator = "-"
            }
        }
        button_multiply.setOnClickListener {
            val currentValue = value.text.toString().toDouble()
            lastOperator = true
            if(start){
                start = false
                firstValue = currentValue
                operator = "*"
            }
            else {
                if(operator.equals("+"))
                    result = firstValue + currentValue
                else if(operator.equals("-"))
                    result = firstValue - currentValue
                else if(operator.equals("*"))
                    result = firstValue * currentValue
                else if(operator.equals("/")) {
                    if(currentValue != 0.0)
                        result = firstValue / currentValue
                    else {
                        result = firstValue
                        Toast.makeText(this, "Divide By Zero not allowed", Toast.LENGTH_SHORT).show()
                    }
                }
                firstValue = result
                value.setText(result.toString())
                operator = "*"
            }
        }
        button_divide.setOnClickListener {
            val currentValue = value.text.toString().toDouble()
            lastOperator = true
            if(start){
                start = false
                firstValue = currentValue
                operator = "/"
            }
            else {
                if(operator.equals("+"))
                    result = firstValue + currentValue
                else if(operator.equals("-"))
                    result = firstValue - currentValue
                else if(operator.equals("*"))
                    result = firstValue * currentValue
                else if(operator.equals("/")) {
                    if(currentValue != 0.0)
                        result = firstValue / currentValue
                    else {
                        result = firstValue
                        Toast.makeText(this, "Divide By Zero not allowed", Toast.LENGTH_SHORT).show()
                    }
                }
                firstValue = result
                value.setText(result.toString())
                operator = "/"
            }
        }
        button_sqrt.setOnClickListener {
            val currentValue = value.text.toString().toDouble()
            lastOperator = true
            if(operator.equals("+"))
                result = firstValue + currentValue
            else if(operator.equals("-"))
                result = firstValue - currentValue
            else if(operator.equals("*"))
                result = firstValue * currentValue
            else if(operator.equals("/")) {
                result = firstValue / currentValue
                if(currentValue != 0.0)
                    result = firstValue / currentValue
                else {
                    result = firstValue
                    Toast.makeText(this, "Divide By Zero not allowed", Toast.LENGTH_SHORT).show()
                }
            }
            if(operator.equals(""))
                result = currentValue.pow(0.5)
            else
                result = result.pow(0.5)

            firstValue = result
            if(!value.text.equals("Divide by zero not allowed"))
                value.setText(result.toString())
            operator = ""
        }
        button_equalsTo.setOnClickListener {
            val currentValue = value.text.toString().toDouble()
            lastOperator = true
            if(operator.equals("+"))
                result = firstValue + currentValue
            else if(operator.equals("-"))
                result = firstValue - currentValue
            else if(operator.equals("*"))
                result = firstValue * currentValue
            else if(operator.equals("/")) {
                result = firstValue / currentValue
                if (currentValue != 0.0)
                    result = firstValue / currentValue
                else {
                    result = firstValue
                    Toast.makeText(this, "Divide By Zero not allowed", Toast.LENGTH_SHORT).show()
                }
            }
            firstValue = result
            value.setText(result.toString())
            operator = ""
        }
    }
}