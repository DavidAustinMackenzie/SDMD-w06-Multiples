package au.edu.swin.sdmd.w06_multiples

import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.parcelize.Parcelize
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    companion object {
        const val RESULT = "result"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalc = findViewById<Button>(R.id.btnCalc)
        val txtView1 = findViewById<TextView>(R.id.textView1)
        val txtView2 = findViewById<TextView>(R.id.textView2)
        //Generate Random numbers and display in textViews
        var randNum1 = Random.nextInt(from = 1, until = 13)
        txtView1.text = randNum1.toString()
        var randNum2  = Random.nextInt(from = 1, until = 13)
        txtView2.text = randNum2.toString()

        btnCalc.setOnClickListener{


            //var result = randNum1 * randNum2

            //Call second activity
            //val intent = Intent(this,ResultActivity::class.java).apply{
                //putExtra("Result",result)
                //putExtra("Num1",randNum1)
                //putExtra("Num2",randNum2)
            //}
            val intent = Intent(this,ResultActivity::class.java).apply{
                putExtra("result",Result(randNum1 * randNum2))
            }
            startActivity(intent)
        }
    }
}