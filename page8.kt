package com.question.bookapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import android.content.Intent

import android.widget.EditText




const val EXTRA_MESSAGE = "com.example.bookapp.MESSAGE"
class page8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page8)
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
