package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import java.util.ArrayDeque
import com.example.mycalculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import java.lang.Error

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private fun addClickListener(button: Button, string: String) {
        button.setOnClickListener() {
            val newValue = binding.value.text.toString() + string
            binding.value.setText(newValue)
        }
    }

    // We used this library to evaluate a mathematical expression from a string https://www.objecthunter.net/exp4j/
    private fun evaluate(string: String): Double {
        var isDigitFlag = false
        var isDecimal = false
        for(ch in string){
            if(ch.isDigit())
                isDigitFlag = true
            else if(ch == '.'){
                if (!isDigitFlag) {
                    Toast.makeText(this, "Decimal not attached to a number", Toast.LENGTH_SHORT).show()
                    return 0.0
                }

                if (isDecimal) {
                    Toast.makeText(this, "Number can't have multiple decimals", Toast.LENGTH_SHORT).show()
                    return 0.0
                }

                isDecimal = true
            }
            else {
                isDigitFlag = false
                isDecimal = false
            }
        }
        val modifiedString = string.replace("÷","/")
        val expression: Expression = ExpressionBuilder(modifiedString).build()
        var result: Double = 0.0
        try {
            result = expression.evaluate()
        }
        catch (e: Exception) {
            Toast.makeText(this,"Error: ${e.message}",Toast.LENGTH_SHORT).show()
        }
        catch (error: Error){
            println(error)
        }
        return result
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
            binding.value.setText(result.toString())
        }

        binding.buttonClear.setOnClickListener() {
            binding.value.setText("")
        }

    }
}