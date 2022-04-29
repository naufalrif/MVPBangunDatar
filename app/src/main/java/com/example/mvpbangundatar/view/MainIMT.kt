package com.example.mvpbangundatar.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mvpbangundatar.R
import com.example.mvpbangundatar.model.DataIMT
import com.example.mvpbangundatar.presenter.IMTPresenter
import com.example.mvpbangundatar.presenter.IMTPresenterInterface
import kotlinx.android.synthetic.main.activity_main_imt.*

class MainIMT : AppCompatActivity(),IMTPresenterInterface {
    private var present : IMTPresenter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_imt)
        present = IMTPresenter(this)
        btn_countIMT.setOnClickListener {
            val bb = et_BB.text.toString().toDouble()
            val tb = et_TB.text.toString().toDouble()
            present!!.countIMT(tb,bb)
        }
    }

    override fun resultIMT(result: DataIMT) {
        if (result.countIMT!! <= 18.5){
            Toast.makeText(this,"Kurus",Toast.LENGTH_LONG)
                .show()
        }else{
            Toast.makeText(this,"Normal",Toast.LENGTH_LONG)
                .show()
        }
    }
}