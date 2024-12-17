package com.hardeka.dicoding


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvBelajarlist: RecyclerView
    private var list: ArrayList<BelajarLang> = arrayListOf()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvBelajarlist = findViewById(R.id.rv_belajarlist)
        rvBelajarlist.setHasFixedSize(true)

        list.addAll(BelajarData.listData)
        rvBelajarlist.layoutManager = LinearLayoutManager(this)
        val listBelajarAdapter = ListBelajarAdapter(list)
        rvBelajarlist.adapter = listBelajarAdapter
    }
}