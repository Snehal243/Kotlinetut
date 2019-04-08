package com.snehal.kotlinetut1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button2.setOnClickListener {

           var Massage:String =edtxuser.text.toString();
            showToast(Massage,Toast.LENGTH_LONG);
            val intent=Intent(this,SecondActivity::class.java)
            intent.putExtra("key","hi this is second activity")
            startActivity(intent)
        }

        button3.setOnClickListener {
            val message: String = edtxuser.text.toString()

            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "Please select app: "))

        }

        button.setOnClickListener {
            val intent=Intent(this,HobbiesActivity::class.java)
            intent.putExtra("key","hi this is second activity")
            startActivity(intent)
        }

    }
}
