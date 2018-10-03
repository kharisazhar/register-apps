package com.dicoding.kharisazhar.myregisterform

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_buat.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            val name:String = edt_email.text.toString()
            intent.putExtra("ooo",name)
            startActivity(intent)
        }
    }
}
