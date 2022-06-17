package jp.techacademy.yuki.naito.human

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val human1 = Human("内藤有紀", 46, "ピアノ")
        val human2 = Human("杉田洋子", 72, "箏")
        human1.say()
        human1.think()
        human2.say()
        human2.think()
    }
}