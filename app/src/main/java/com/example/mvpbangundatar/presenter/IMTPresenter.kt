package com.example.mvpbangundatar.presenter

import com.example.mvpbangundatar.model.DataIMT

class IMTPresenter(var imt : IMTPresenterInterface) {
    fun countIMT(tinggi : Double, berat : Double){
        val hasilIMT = berat/(tinggi*tinggi)
        val hitungIMT = DataIMT()
        hitungIMT.countIMT = hasilIMT.toInt()

        imt.resultIMT(hitungIMT)

    }
}