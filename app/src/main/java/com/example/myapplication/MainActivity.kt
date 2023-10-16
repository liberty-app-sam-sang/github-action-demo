package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.wello.app.android.dev.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.tv)
        textView.text = "HELLO: ${countryToEmoji("CN")} ${countryToEmoji("US")} ${countryToEmoji("JP")} ${countryToEmoji("HK")}  ${countryToEmoji("MO")} ${countryToEmoji("TW")}"
    }

    fun countryToEmoji(country: String): String {
        val firstLetter = Character.codePointAt(country, 0) - 0x41 + 0x1F1E6
        val secondLetter = Character.codePointAt(country, 1) - 0x41 + 0x1F1E6
        val emojiString = String(Character.toChars(firstLetter)) + String(Character.toChars(secondLetter))
        println(emojiString)
        return emojiString
    }
}