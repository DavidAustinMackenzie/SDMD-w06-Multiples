package au.edu.swin.sdmd.w06_multiples

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalc = findViewById<Button>(R.id.btnCalc)
        val txtView1 = findViewById<TextView>(R.id.textView1)
        val txtView2 = findViewById<TextView>(R.id.textView2)
        btnCalc.setOnClickListener{
            //Generate Random numbers and display in textViews
            var randNum1 = Random.nextInt(from = 1, until = 13)
            txtView1.text = randNum1.toString()
            var randNum2  = Random.nextInt(from = 1, until = 13)
            txtView2.text = randNum2.toString()

            //var result = randNum1 * randNum2

            //Call second activity
            val intent = Intent(this,ResultActivity::class.java).apply{
                //putExtra("Result",result)
                putExtra("Num1",randNum1)
                putExtra("Num2",randNum2)
            }
            startActivity(intent)
        }
    }
}