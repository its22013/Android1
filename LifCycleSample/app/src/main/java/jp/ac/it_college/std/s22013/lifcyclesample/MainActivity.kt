package jp.ac.it_college.std.s22013.lifcyclesample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import jp.ac.it_college.std.s22013.lifcyclesample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("LifeCycleSample", "Main onCreate() called.")
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btNext.setOnClickListener(::onNextClick)
    }

    private fun onNextClick(view: View) {
        val intent = Intent(this@MainActivity, SubActivity::class.java)

        startActivity(intent)
    }
}