package com.example.fackaadhar

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class aadhar2 : AppCompatActivity() {





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_aadhar2)

        val nameEn=findViewById<TextView>(R.id.fName)
        val nameHi=findViewById<TextView>(R.id.textView16)
        val ageD=findViewById<TextView>(R.id.textView20)
        val genderM=findViewById<TextView>(R.id.textView17)
        val aadharN1=findViewById<TextView>(R.id.textView18)
        val addressHi=findViewById<TextView>(R.id.textView19)
        val addressEn=findViewById<TextView>(R.id.textView22)
        val aadharN2=findViewById<TextView>(R.id.textView21)




        val intent=intent
        val name:String?=intent.getStringExtra("name")
        val name1:String?=intent.getStringExtra("nameH")
        val age:String?=intent.getStringExtra("age")
        val gender:String?=intent.getStringExtra("gender")
        val aadhar:String?=intent.getStringExtra("aadhar")
        val addressH:String?=intent.getStringExtra("addressE")
        val addressE:String?=intent.getStringExtra("addressH")
        val aadhar2:String?=intent.getStringExtra("aadhar")


        nameEn.text=("$name")
        nameHi.text=("$name1")
        ageD.text=("$age")
        genderM.text=("$gender")
        aadharN1.text=("$aadhar")
        addressHi.text=("$addressH")
        addressEn.text=("$addressE")
        aadharN2.text=("$aadhar2")

         val contract = registerForActivityResult(ActivityResultContracts.GetContent()){
            val imageSelect=findViewById<ImageView>(R.id.imageSelect)
             imageSelect.setImageURI(it)
        }

        var  insartbtn=findViewById<Button>(R.id.imag)

        insartbtn.setOnClickListener {
            contract.launch("image/*")

        }




    }
}