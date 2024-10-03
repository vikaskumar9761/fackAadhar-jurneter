package com.example.fackaadhar

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val nameE=findViewById<EditText>(R.id.nameE)
        val nameH=findViewById<EditText>(R.id.nameH)
        val age=findViewById<EditText>(R.id.age)
        val gender=findViewById<EditText>(R.id.gender)
        val aadharNumber=findViewById<EditText>(R.id.aadharN)
        val addressE=findViewById<EditText>(R.id.addressE)
        val addressH=findViewById<EditText>(R.id.addressH)
        val getAadhar=findViewById<Button>(R.id.getAadhar)
        val clear=findViewById<Button>(R.id.clear)

        getAadhar.setOnClickListener {

            val name:String=nameE.text.toString()
            val nameH:String=nameH.text.toString()
            val age:String=age.text.toString()
            val gender:String=gender.text.toString()
            val aadharNumber:String=aadharNumber.text.toString()
            val addresE:String=addressE.text.toString()
            val addressH:String=addressH.text.toString()

            val intent = Intent(this,aadhar2::class.java)

            intent.putExtra("name",name)
            intent.putExtra("nameH",nameH)
            intent.putExtra("age",age)
            intent.putExtra("gender",gender)
            intent.putExtra("aadhar",aadharNumber)
            intent.putExtra("addressE",addresE)
            intent.putExtra("addressH",addressH)

            startActivity(intent)




        }

    }
}