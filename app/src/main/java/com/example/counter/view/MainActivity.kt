package com.example.counter.view

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.counter.R
import com.example.counter.databinding.ActivityMainBinding
import com.example.counter.utils.showToast

class MainActivity : AppCompatActivity(), CounterView {
    private lateinit var binding: ActivityMainBinding
    private var presenter = Presenter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initListener()
    }

    private fun initListener() {
        with(binding) {
            btnPlus.setOnClickListener {
                presenter.increment()
            }
            btnMinus.setOnClickListener {
                presenter.decrement()
            }

        }
    }

    override fun showNewCount(number: Int) {
        binding.tvResult.text = number.toString()
    }

    override fun showToast() {
        showToast(getString(R.string.toast_15))
    }

    override fun textColor() {
        binding.tvResult.setTextColor(Color.GREEN)
    }
}