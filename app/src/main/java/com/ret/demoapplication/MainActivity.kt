package com.ret.demoapplication

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ret.demoapplication.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {


    lateinit var mainBinding: ActivityMainBinding
    lateinit var tempAdapter: TempAdapter

    private val testViewModel: TestViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        tempAdapter = TempAdapter()

        with(mainBinding.recyclerView) {
            layoutManager = LinearLayoutManager(this@MainActivity, RecyclerView.VERTICAL, false)
            adapter = tempAdapter
        }

        val list = ArrayList<ItemModel>()
        for (i in 5 until 15) {
            list.add(ItemModel(i.toString()))
        }


        testViewModel.chapterItemList(object : PassAnyListener<BaseChapterItemModel> {
            override fun passData(t: BaseChapterItemModel?) {
                t?.let {
                    tempAdapter.setList(t.data)
                }
            }
        })


        var a = 50
        var b = 150

        Log.e("A","$a")
        Log.e("B","$b")

        var tempA = a
        a = b
        b = tempA

        Log.e("A","$a")
        Log.e("B","$b")


    }
}
