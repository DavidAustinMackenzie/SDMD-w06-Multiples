package au.edu.swin.sdmd.w06_multiples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        //Get the value parsed from prev activity
        //val result = intent.getIntExtra("Result",0)
        val num1 = intent.getIntExtra("Num1",0)
        val num2 = intent.getIntExtra("Num2",0)
        val textView3 = findViewById<TextView>(R.id.textView3)

        //Set output to textview
        //textView3.text = result.toString()
        textView3.text = (num1 * num2).toString()
    }
}