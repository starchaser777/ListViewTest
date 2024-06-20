package kr.ac.kopo.listviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var imgv: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list = findViewById<ListView>(R.id.list)
        imgv = findViewById<ImageView>(R.id.imgv)

        var items = arrayOf("바나나", "토마토", "메론", "딸기", "포도", "참외", "키위")
        var imgRes = arrayOf(R.drawable.banana, R.drawable.tomato, R.drawable.melon, R.drawable.strawberry, R.drawable.grape, R.drawable.oriental_melon, R.drawable.kiwi)

        var adapter : ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1, items)
        list.adapter = adapter

        list.setOnItemClickListener { parent, view, position, id ->
            imgv.setImageResource(imgRes[position])
            Toast.makeText(applicationContext, items[position] + "는(은) 정말 달콤해요~", Toast.LENGTH_SHORT).show()
        }
    }
}