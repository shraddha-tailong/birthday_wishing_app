package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createBirthdayButton.setOnClickListener{
            val name=editTextTextPersonName.editableText.toString()
            val intent= Intent(this,Birthday_greeting::class.java)
            intent.putExtra(Birthday_greeting.NAME_EXTRA,name)

            startActivity(intent)

        }
    }
}