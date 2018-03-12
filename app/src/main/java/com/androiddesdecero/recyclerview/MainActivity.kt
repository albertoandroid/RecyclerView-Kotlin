package com.androiddesdecero.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var muro = ArrayList<Muro>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        data()
        mainActivityRecyclerView.layoutManager = LinearLayoutManager(this)
        mainActivityRecyclerView.adapter = MuroAdapter(muro)

    }

    fun data() {
        for(i in 0..10) {
            muro.add(Muro(R.drawable.ic_cake, "Feliz Cumpleaños", R.drawable.ic_alberto, "Alberto"))
            muro.add(Muro(R.drawable.ic_bike, "Salgo con la bici", R.drawable.ic_victoria, "Victoria"))
            muro.add(Muro(R.drawable.ic_cafe, "Tomando un cafe con los amigos", R.drawable.ic_marcos, "Marcos"))

            muro.add(Muro(R.drawable.ic_cake, "Feliz Cumpleaños", R.drawable.ic_alberto, "Alberto"))
            muro.add(Muro(R.drawable.ic_bike, "Salgo con la bici", R.drawable.ic_victoria, "Victoria"))
            muro.add(Muro(R.drawable.ic_cafe, "Tomando un cafe con los amigos", R.drawable.ic_marcos, "Marcos"))
        }
    }
}
