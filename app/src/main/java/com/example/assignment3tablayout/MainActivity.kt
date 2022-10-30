package com.example.assignment3tablayout

import android.os.Bundle
import android.util.DisplayMetrics
import android.view.View
import android.widget.EditText
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.marginLeft


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun addFun(view: View) {
        val tableRow=TableRow(this)
        tableRow.setBackgroundColor(resources.getColor(R.color.red))




        val versionText=TextView(this)
        versionText.width = getScreenWidth() / 2
        versionText.setTextColor(resources.getColor(R.color.black))
        versionText.setPadding(10,5,10,5)
        val versionInputField=findViewById<EditText>(R.id.version)
        val versionInput=versionInputField.text
        versionText.text=versionInput

        val nameText=TextView(this)
        versionText.width = getScreenWidth() / 2
        versionText.setTextColor(resources.getColor(R.color.black))
        nameText.setPadding(10,5,10,5)
        val nameInputField=findViewById<EditText>(R.id.name)
        val nameInput=nameInputField.text
        nameText.text=nameInput


        tableRow.addView(versionText)
        tableRow.addView(nameText)

        val tableLayout=findViewById<TableLayout>(R.id.table)
        tableLayout.addView(tableRow)

        versionInputField.text.clear()
        nameInputField.text.clear()
    }

    fun getScreenWidth() : Int {
        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)
        val height = displayMetrics.heightPixels
        val width = displayMetrics.widthPixels
        return width
    }


}
