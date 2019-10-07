package com.minite

import android.R
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_empty.view.*
import java.util.*


class EmptyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_empty)

        val button: Button = findViewById(R.id.button1)

        button.setOnClickListener(::onButton1Click)
    }


    private fun onButton1Click(view: View) {
        view.button1.text = UUID.randomUUID().toString()
    }
}
