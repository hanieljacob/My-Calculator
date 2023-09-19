package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlin.math.pow
import java.util.ArrayDeque
import com.example.mycalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private fun addClickListener(button: Button, string: String) {
        button.setOnClickListener() {
            val newValue = binding.value.text.toString() + string
            binding.value.setText(newValue)
        }
    }

    private fun evaluate(string: String) {
        val operators = setOf('+', '-', '÷', '*')
        val stack = ArrayDeque<Char>()
        var tempString = ""

        for (char in string) {
            if (!operators.contains(char)) {
                tempString += char
            }

            else {
                stack.push(char)
            }
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        addClickListener(binding.button0, getString(R.string.button_0))
        addClickListener(binding.button1, getString(R.string.button_1))
        addClickListener(binding.button2, getString(R.string.button_2))
        addClickListener(binding.button3, getString(R.string.button_3))
        addClickListener(binding.button4, getString(R.string.button_4))
        addClickListener(binding.button5, getString(R.string.button_5))
        addClickListener(binding.button6, getString(R.string.button_6))
        addClickListener(binding.button7, getString(R.string.button_7))
        addClickListener(binding.button8, getString(R.string.button_8))
        addClickListener(binding.button9, getString(R.string.button_9))
        addClickListener(binding.buttonAdd, getString(R.string.button_add))
        addClickListener(binding.buttonMinus, getString(R.string.button_minus))
        addClickListener(binding.buttonMultiply, getString(R.string.button_multiply))
        addClickListener(binding.buttonDivide, getString(R.string.button_divide))
        addClickListener(binding.buttonDot, getString(R.string.button_dot))
        addClickListener(binding.buttonSqrt, getString(R.string.button_sqrt))

        binding.buttonEqualsTo.setOnClickListener() {
            val result = evaluate(binding.value.text.toString())
            binding.value.setText(result)
        }

        binding.buttonClear.setOnClickListener() {
            binding.value.setText("")
        }

    }
}