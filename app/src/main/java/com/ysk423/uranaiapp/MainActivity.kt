package com.ysk423.uranaiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //id取得
        var tv:TextView = findViewById<TextView>(R.id.uranaiText)
        var btn:Button = findViewById<Button>(R.id.uranaiBtn)

        //クリック処理
        btn.setOnClickListener{
           // tv.text ="大吉"

            //配列
            var uranai = arrayOf("大吉","中吉","小吉","凶")

            //乱数
            var num = Random().nextInt(uranai.count())
            tv.text = uranai.get(num)
        }

    }
}