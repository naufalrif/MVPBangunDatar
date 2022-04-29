package com.example.mvpbangundatar.presenter

import com.example.mvpbangundatar.model.HasilPL

class PersegiPanjPresenter(var ppView : PersegiPanjangPresenter) {
    fun hitung(panjang : Int, lebar : Int){
        val totalpp = panjang*lebar
        val count = HasilPL()
        count.total = totalpp

        ppView.hasil(count)
    }
}