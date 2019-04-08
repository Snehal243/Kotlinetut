package com.snehal.kotlinetut1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.snehal.kotlinetut1.adapters.HobbiesAdapter
import com.snehal.kotlinetut1.models.Supplier
import kotlinx.android.synthetic.main.hobbies_activity.*
import kotlinx.android.synthetic.main.second_activity.*

class HobbiesActivity:AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hobbies_activity)
        setupRecycleview()
    }

    private fun setupRecycleview() {
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager

        val adapter= HobbiesAdapter(this, Supplier.hobbies)
        recyclerView.adapter = adapter
    }

}
