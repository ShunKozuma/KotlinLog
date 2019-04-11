package kozuma.shun.techacademy.jp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("山田祐一", 22,"サッカー")

        human1.say()

        val human2 = Human("田中一郎",15,"野球")

        human2.think()

    }

    private fun total(first: Int ,last: Int): Int{
        var sum = 0
        for(i in first .. last){
            sum += i
        }
            return sum
    }

}
