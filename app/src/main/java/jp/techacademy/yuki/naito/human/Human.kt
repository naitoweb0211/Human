package jp.techacademy.yuki.naito.human

import android.util.Log

open class Human: Animal, Thinkable {
    var hobby = ""
    // 引数付きコンストラクタ
    constructor(name: String, age: Int, hobby: String): super(name, age) {
        this.hobby = hobby
    }

    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。 年は" + this.age + "歳です。")
    }

    // Movableインターフェイスのメソッドをオーバーライド
    override fun think() {
        Log.d("kotlintest",this.name + "は" + this.hobby + "について考える。")
    }
}