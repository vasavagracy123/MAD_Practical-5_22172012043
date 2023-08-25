package com.example.mad_practical_5_22172012043

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.CallLog
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import androidx.core.text.parseAsHtml

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val browseButton: Button =findViewById(R.id.button_Browse)
        val editTextBrowser: EditText =findViewById(R.id.editTextText)
        browseButton.setOnClickListener {
            openbrowser(editTextBrowser.text.toString())
        }
    }
    fun openbrowser(url:String){
        Intent(Intent.ACTION_VIEW,Uri.parse(url)).also{startActivity(it)

        }
        fun opencall(no:String){
            Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:$no")).also{startActivity(it)}
        }
    }
    fun openCalllog(){
        Intent(Intent.ACTION_VIEW).setType(CallLog.Calls.CONTENT_TYPE).also { startActivity(it) }

    }
    fun openGallary(){
        Intent(Intent.ACTION_VIEW).setType("image/*").also { startActivity(it) }

    }
    fun camera(){
        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { startActivity(it) }

    }
    fun Alaram(){
        Intent(AlarmClock.ACTION_SHOW_ALARMS).also { startActivity(it) }

    }

}