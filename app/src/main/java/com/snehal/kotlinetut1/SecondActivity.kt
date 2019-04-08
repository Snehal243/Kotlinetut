package com.snehal.kotlinetut1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.second_activity.*

class SecondActivity:AppCompatActivity (){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        //safe call ?.
        //safe call with let   /.let{ }

       val bundle: Bundle?= intent.extras

        bundle?.let { //null sefty operator

            val msg = bundle!!.getString("key")
            txvTitle.setText(msg)
            showToast(msg)
        }

    }

}