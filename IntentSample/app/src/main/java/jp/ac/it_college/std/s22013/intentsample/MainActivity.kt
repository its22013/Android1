package jp.ac.it_college.std.s22013.intentsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import jp.ac.it_college.std.s22013.intentsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.lvMenu.apply {
            adapter = MenuListAdapter(menuList) { name, price ->
                val intent2MenuListThanks = Intent(
                    this@MainActivity,
                    MenuThanksActivity::class.java
                )
                intent2MenuListThanks.putExtra("menuName", name)
                intent2MenuListThanks.putExtra("menuPrice", price)

                startActivity(intent2MenuListThanks)
            }

            LinearLayoutManager(this@MainActivity).let {
                layoutManager = it
                addItemDecoration(DividerItemDecoration(this@MainActivity, it.orientation))
            }
        }
    }
}