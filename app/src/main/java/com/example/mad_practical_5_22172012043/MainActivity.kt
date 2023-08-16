package com.example.mad_practical_5_22172012043

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val browseButton:Button=findViewById(R.id.button_browse)
        val editTextBrowser:EditText=findViewById(R.id.editTextText2)
        browseButton.setOnClickListener {
            openBrowser(editTextBrowser.text.toString())
        }
    }
    fun openBrowser(url: String){
       Intent(Intent.ACTION_VIEW, Uri.parse(url)).also { startActivity(it) }
    }
    fun openCall(no:String){
        Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:$no")).also {startActivity(it)}
    }
    fun openCallLog(){

    }
    fun openGallery(){

    }
    fun openAlam(){

    }
}