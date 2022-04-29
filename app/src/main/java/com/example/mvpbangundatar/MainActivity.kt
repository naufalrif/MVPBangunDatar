package com.example.mvpbangundatar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mvpbangundatar.model.HasilPL
import com.example.mvpbangundatar.presenter.PersegiPanjPresenter
import com.example.mvpbangundatar.presenter.PersegiPanjangPresenter

class MainActivity : AppCompatActivity(),PersegiPanjangPresenter {

    private var presenter : PersegiPanjPresenter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = PersegiPanjPresenter(this)
        presenter!!.hitung(10,5)
    }

    override fun hasil(hasil: HasilPL) {
        Toast.makeText(this, hasil.total.toString(), Toast.LENGTH_LONG).show()
    }
}