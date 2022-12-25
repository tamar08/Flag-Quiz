package com.example.flagquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        tv_result2.text="Your Score is \n$correctAnswers out of 15"
        if(correctAnswers == 15){
            tv_result1.text = "Perfect!"
        }
        else if(correctAnswers == 14 || correctAnswers ==13){
            tv_result1.text = "Really Good!"
        }
        else if(correctAnswers in 10..12){
            tv_result1.text = "Good!"
        }
        else if(correctAnswers in 7..9){
            tv_result1.text = "Not Bad!"
        }
        else if(correctAnswers in 4..6) {
            tv_result1.text = "Bad!"
        }
        else {
            tv_result1.text = "Really Bad!"
        }

        btn_finish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}