package jp.ac.it_college.std.s22013.hellosample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import jp.ac.it_college.std.s22013.hellosample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    /*
    ViewBinding 機能を使って画面を作る方法。
    activity_main.xml ファイルに対して ActivityMainBinding クラスが
    自動生成されます。（レイアウトファイル名 ＋ Binding）
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Binding クラスのインスタンスを生成してもらう
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setContentView(R.layout.activity_main)

        // ボタンを取ってくる
//        val btClick = findViewById<Button>(R.id.btClick)
        //リスナクラスのインスタンスを作る
        val listener = HelloListener()

        binding.btClick.setOnClickListener(listener)
    }
    private inner class HelloListener : View.OnClickListener {
        override fun onClick(v: View?) {
            // お名前が入力されるでだろう EditText を取ってくる
//            val input = findViewById<EditText>(R.id.etName)
//            val input = binding.etName

            // メッセージを出力する先の TextView を取ってくる
//            val output = findViewById<TextView>(R.id.tvOutput)
//            val output = binding.tvOutput

            // input(EditText) から入力内容を取り出して String型へ
            val inputStr = binding.etName.text.toString()

            //メッセージを出す
            binding.tvOutput.text = "${inputStr}さん、こんにちは"
        }

    }
}