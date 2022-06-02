package com.codeyuba.mvpbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.codeyuba.mvpbasic.model.Data
import com.codeyuba.mvpbasic.presenter.MainPresenter
import com.codeyuba.mvpbasic.presenter.MainView

class MainActivity : AppCompatActivity(), MainView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberOne = 10
        val numberTwo = 12

        val presenter = MainPresenter(this)
        presenter.hitung(numberOne,numberTwo)
    }

    override fun hasilPresenter(data: Data) {
        Log.d("Hasil",data.dataHasil.toString())
    }
}