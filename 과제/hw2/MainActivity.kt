package com.cookandroid.a201501489_hw2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var edit1 : EditText; lateinit var edit2 : EditText
    lateinit var btnAdd : RadioButton ; lateinit var btnSub : RadioButton
    lateinit var btnMul : RadioButton; lateinit var btnDiv : RadioButton
    lateinit var edit3 : EditText
    lateinit var num1 : String; lateinit var num2 : String
    lateinit var ans : String
    var result : Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edit1 = findViewById<EditText>(R.id.edit1)
        edit2 = findViewById<EditText>(R.id.edit2)
        btnAdd = findViewById<RadioButton>(R.id.BtnAdd)
        btnSub = findViewById<RadioButton>(R.id.BtnSub)
        btnMul = findViewById<RadioButton>(R.id.BtnMul)
        btnDiv = findViewById<RadioButton>(R.id.BtnDiv)

        edit3 = findViewById<EditText>(R.id.edit3)

        if (edit1.text.toString() != "" && edit2.text.toString() != "")
        {
            btnAdd.setOnTouchListener { view, motionEvent ->
                num1 = edit1.text.toString()
                num2 = edit2.text.toString()
                result = num1.toDouble() + num2.toDouble()
                edit3.setText(result.toString())
                false
            }
            btnSub.setOnTouchListener { view, motionEvent ->
                num1 = edit1.text.toString()
                num2 = edit2.text.toString()
                result = num1.toDouble() - num2.toDouble()
                edit3.setText(result.toString())
                false
            }
            btnMul.setOnTouchListener { view, motionEvent ->
                num1 = edit1.text.toString()
                num2 = edit2.text.toString()
                result = num1.toDouble() * num2.toDouble()
                edit3.setText(result.toString())
                false
            }
            btnDiv.setOnTouchListener { view, motionEvent ->
                num1 = edit1.text.toString()
                num2 = edit2.text.toString()
                if (num2.toInt() == 0) {
                    edit3.setText("불가")
                } else {
                    result = num1.toDouble() / num2.toDouble()
                    edit3.setText(result.toString())
                }
                false
            }
        }
    }