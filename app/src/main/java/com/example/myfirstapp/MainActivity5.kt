package com.example.myfirstapp

import android.os.Bundle
import android.widget.Switch
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main5)

        val switch1 = findViewById<Switch>(R.id.switch1)

        switch1.setOnCheckedChangeListener{ _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Item added to Cart", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "Item removed from Cart", Toast.LENGTH_SHORT).show()
            }
        }

        val switch2 = findViewById<Switch>(R.id.switch2)

        switch2.setOnCheckedChangeListener{ _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Item added to Cart", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "Item removed from Cart", Toast.LENGTH_SHORT).show()
            }
        }

        val switch3 = findViewById<Switch>(R.id.switch3)

        switch3.setOnCheckedChangeListener{ _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Item added to Cart", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "Item removed from Cart", Toast.LENGTH_SHORT).show()
            }
        }

        val switch4 = findViewById<Switch>(R.id.switch4)

        switch4.setOnCheckedChangeListener{ _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Item added to Cart", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "Item removed from Cart", Toast.LENGTH_SHORT).show()
            }
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}