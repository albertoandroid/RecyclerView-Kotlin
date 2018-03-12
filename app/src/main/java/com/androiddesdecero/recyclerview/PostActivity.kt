package com.androiddesdecero.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_post.*

class PostActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)
        postActivityTextoPost.text = intent.getStringExtra(Constans.POST)
        postActivityFotoPost.setImageResource(intent.getIntExtra(Constans.FOTO,0))
    }
}
