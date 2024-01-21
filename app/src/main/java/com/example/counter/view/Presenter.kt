package com.example.counter.view

import com.example.counter.model.CounterModel

class Presenter(private var view: CounterView) {
    private var model = CounterModel()

    fun increment() {
        model.increment()
        view.showNewCount(model.number)
        checkNumber(model.number)
    }

    fun decrement() {
        model.decrement()
        view.showNewCount(model.number)
        checkNumber(model.number)
    }

    private fun checkNumber(number: Int) {
        if (number == 10) {
            view.showToast()
        }
        if (number == 15) {
            view.textColor()
        }
    }
}