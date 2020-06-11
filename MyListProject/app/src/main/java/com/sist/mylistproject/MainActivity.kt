package com.sist.mylistproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var memList= arrayListOf<Member>(
        Member("홍길동","서울","010-0909-9999"),
        Member("심청이","경기","010-2345-9999"),
        Member("춘향이","대전","011-0909-9969"),
        Member("박문수","대구","010-0000-9939"),
        Member("김두한","부산","010-0909-9879")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter=MainListAdapter(this,memList)
        mainListView.adapter=adapter
    }
}