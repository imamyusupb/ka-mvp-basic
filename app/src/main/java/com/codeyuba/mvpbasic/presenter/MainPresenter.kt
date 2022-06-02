package com.codeyuba.mvpbasic.presenter

import com.codeyuba.mvpbasic.model.Data

class MainPresenter(val data :MainView) {

    fun hitung(numbOne :Int , numbTwo :Int){
        val hasil = numbOne.times(numbTwo)

        val model = Data()
        model.dataHasil = hasil
        data.hasilPresenter(model)
    }


}