package org.techtown.bmipractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtHeight : EditText = findViewById(R.id.txtHeight)

        val txtWeight : EditText = findViewById(R.id.txtWeight)

        val resultButton = findViewById<Button>(R.id.resultButton)

        resultButton.setOnClickListener{

            Log.d("MainActivity","resultButton 이 클릭 되었습니다.")


            if (txtHeight.text.isEmpty() || txtWeight.text.isEmpty()){

                Toast.makeText(this, "빈 값이 있습니다.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val height :Int =  txtHeight.text.toString().toInt()
            val weight : Int = txtWeight.text.toString().toInt()

            val intent =Intent(this, ResultActivity::class.java)
            intent.putExtra("height",height)
            intent.putExtra("weight",weight)

            startActivity(intent)

        }

    }
}