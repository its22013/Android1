package jp.ac.it_college.std.s22013.listviewreplacesample

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import jp.ac.it_college.std.s22013.listviewreplacesample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var menuList = mutableListOf(
            "から揚げ定食",
            "ハンバーグ定食",
            "生姜焼き定食",
            "ステーキ定食",
            "野菜炒め定食",
            "とんかつ定食",
            "ミンチかつ定食",
            "チキンかつ定食",
            "コロッケ定食",
            "回鍋肉定食",
            "麻婆雨豆腐定食",
            "青椒肉絲定食",
            "八宝菜定食",
            "酢豚定食",
            "豚の角煮定食",
            "焼き鳥定食",
            "焼き魚定食",
            "焼肉定食",
        )

//        binding.rvMenu.adapter = MenuListAdapter(menuList)
            binding.rvMenu.apply {
                val linearLayoutManager = LinearLayoutManager(this@MainActivity)
                layoutManager = LinearLayoutManager(this@MainActivity)
                    adapter = MenuListAdapter(menuList)
                addItemDecoration(DividerItemDecoration(this@MainActivity, linearLayoutManager.orientation ))
        }
    }
}