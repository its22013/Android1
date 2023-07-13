package jp.ac.it_college.std.s22013.hellosample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btClick = findViewById<Button>(R.id.btClick)

        val listener = HelloListener()

        btClick.setOnClickListener(listener)
    }
    private inner class HelloListener : View.OnClickListener {
        override fun onClick(v: View?) {
            // お名前が入力されるでだろう EditText を取ってくる
            val input = findViewById<EditText>(R.id.etName)

            // メッセージを出力する先の TextView を取ってくる
            val output = findViewById<TextView>(R.id.tvOutput)

            // input(EditText) から入力内容を取り出して String型へ
            val inputStr = input.text.toString()
            //メッセージを出す
            output.text = "${inputStr}さん、こんにちは！"
        }

    }
}