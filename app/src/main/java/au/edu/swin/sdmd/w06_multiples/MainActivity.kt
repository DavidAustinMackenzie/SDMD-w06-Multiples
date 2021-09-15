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

    var randNum1 = 0
    var randNum2 = 0
    lateinit var txtView1: TextView
    lateinit var txtView2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Get inputs
        val btnCalc = findViewById<Button>(R.id.btnCalc)
        val btnReset = findViewById<Button>(R.id.btnReset)
        txtView1 = findViewById(R.id.textView1)
        txtView2 = findViewById(R.id.textView2)

        //Set Initial Values
        resetNumbers()

        //Pass values to ResultActivity and start Activity
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

        //Generate new random numbers
        btnReset.setOnClickListener{
            resetNumbers()
        }
    }

    //Used to generate random numbers in textView1 and textView2
    private fun resetNumbers() {
        //Generate Random numbers and display in textViews
        randNum1 = Random.nextInt(from = 1, until = 13)
        txtView1.text = randNum1.toString()
        randNum2  = Random.nextInt(from = 1, until = 13)
        txtView2.text = randNum2.toString()
    }
}