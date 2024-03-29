package com.example.quizapp

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.QuizQuestionsAcitivity
import com.quizapp.Constants
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    btn_start.setOnClickListener{

        if(et_name.text.toString().isEmpty()) {
            Toast.makeText(this,"Please enter a name", Toast.LENGTH_SHORT).show()
        }
        else{
            val intent = Intent(this,QuizQuestionsAcitivity::class.java)
            intent.putExtra(Constants.USER_NAME,et_name.text.toString())
            startActivity(intent)
            finish()
        }
    }


    }
}