package com.adrianalatorre.paintapp

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.adrianalatorre.paintapp.PaintView.Companion.colorList
import com.adrianalatorre.paintapp.PaintView.Companion.currentBrush
import com.adrianalatorre.paintapp.PaintView.Companion.pathList

class MainActivity : AppCompatActivity() {

    companion object{
        var path = Path()
        var paintBrush = Paint()
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        var redBtn = findViewById<ImageButton>(R.id.redColor)
        var blueBtn = findViewById<ImageButton>(R.id.blueColor)
        var blackBtn = findViewById<ImageButton>(R.id.blackColor)
        var eraser = findViewById<ImageButton>(R.id.whiteColor)

        redBtn.setOnClickListener{
            Toast.makeText(this, "CLicked", Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.RED
            currentColor(paintBrush.color)
        }

        blueBtn.setOnClickListener{
            Toast.makeText(this, "CLicked", Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.BLUE
            currentColor(paintBrush.color)
        }

        blackBtn.setOnClickListener{
            Toast.makeText(this, "CLicked", Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.BLACK
            currentColor(paintBrush.color)
        }

        eraser.setOnClickListener{
            Toast.makeText(this, "CLicked", Toast.LENGTH_SHORT).show()
            pathList.clear()
            colorList.clear()
            path.reset()
        }
    }

    private fun currentColor(color:Int){
        currentBrush = color
        path = Path()
    }
}