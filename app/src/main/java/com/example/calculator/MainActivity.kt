package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var input = binding.numberInput.text
        val numbers = resources.getStringArray(R.array.btn_numbers)

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


}