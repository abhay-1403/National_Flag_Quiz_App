package com.example

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quizapp.MainActivity
import com.example.quizapp.R
import com.quizapp.Constants
import kotlinx.android.synthetic.main.activity_result_acitivity.*

class ResultAcitivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_acitivity)

        val username = intent.getStringExtra(Constants.USER_NAME)
        tv_name.text = username
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val correctAnswer = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)

        tv_score.text = "YOUR SCORE IS $correctAnswer out of $totalQuestions"
        btn_finish.setOnClickListener(){
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}