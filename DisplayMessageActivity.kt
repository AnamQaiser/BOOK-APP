package com.question.bookapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

import android.widget.TextView

const val EXTRA_MESSAGE = "com.example.bookapp.MESSAGE"
class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)
    }
    fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.editTextTextalphabets)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

}
