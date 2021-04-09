package com.cookandroid.a201501489_cyj_hw1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var edittext1 : EditText; lateinit var edittext2 : EditText
    lateinit var btn : Button
    lateinit var textview3 : TextView
    lateinit var ansid : String ; lateinit var anspw : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        edittext1 = findViewById<EditText>(R.id.edittext1)
        edittext2 = findViewById<EditText>(R.id.edittext2)
        btn = findViewById<Button>(R.id.btn)
        textview3 = findViewById<TextView>(R.id.textView3)

        btn.setOnTouchListener { view, motionEvent ->
            ansid = edittext1.text.toString()
            anspw = edittext2.text.toString()
            if (ansid !="" && anspw != "") {
                if (ansid == "201501489") {
                    if (anspw == "choiyoungjin") {
                        textview3.text = "결과 : 로그인 성공"
                    }
                    else {
                        textview3.text = "결과 : 로그인 실패"
                    }
                }
                else {
                    textview3.text = "결과 : 로그인 실패"
                }
            }
            else {
                textview3.text = "결과 : "
            }
            false
        }


    }


}