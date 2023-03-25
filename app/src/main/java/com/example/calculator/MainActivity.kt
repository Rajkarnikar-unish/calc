package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.calculator.databinding.ActivityMainBinding
import kotlin.jvm.internal.Ref.BooleanRef

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var input = ""
    var lastDigit : Boolean = false
    var lastDecimal: Boolean = false
    var consistsDecimal: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val numbers = resources.getStringArray(R.array.btn_numbers)

        binding.buttonClear.setOnClickListener {
            binding.numberInput.text = ""
        }

        for (n in numbers) {
            when (n) {
                0.toString() -> binding.buttonZero.text = resources.getString(R.string.btn_name, n)
                1.toString() -> binding.buttonOne.text = resources.getString(R.string.btn_name, n)
                2.toString() -> binding.buttonTwo.text = resources.getString(R.string.btn_name, n)
                3.toString() -> binding.buttonThree.text = resources.getString(R.string.btn_name, n)
                4.toString() -> binding.buttonFour.text = resources.getString(R.string.btn_name, n)
                5.toString() -> binding.buttonFive.text = resources.getString(R.string.btn_name, n)
                6.toString() -> binding.buttonSix.text = resources.getString(R.string.btn_name, n)
                7.toString() -> binding.buttonSeven.text = resources.getString(R.string.btn_name, n)
                8.toString() -> binding.buttonEight.text = resources.getString(R.string.btn_name, n)
                9.toString() -> binding.buttonNine.text = resources.getString(R.string.btn_name, n)
            }
        }
    }

    fun onDigitsClicked(view: View) {
        binding.numberInput.let {
            it.append((view as Button).text)
            lastDecimal = false
            lastDigit = true
        }
    }

    fun onDecimal(view : View) {
        if (lastDigit && !lastDecimal && !consistsDecimal)
            binding.numberInput.let {
                it.append((view as Button).text)
                lastDecimal = true
                consistsDecimal = true
                lastDigit = false
            }
    }

    fun onOperator(view: View) {
        binding.numberInput.text.let {

        }
    }

    fun onEquals(view: View) {
        binding.totalTextview.text = binding.numberInput.text.toString()

    }

    fun onBackspace(view: View) {
        binding.numberInput.let {
            input = it.text.toString()
            if (input.isNotEmpty()) {
                it.text = input.substring(0, input.length - 1)
            }
        }
    }
}