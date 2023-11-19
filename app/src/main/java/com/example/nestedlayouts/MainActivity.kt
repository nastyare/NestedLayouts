package com.example.nestedlayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.view.View

class MainActivity : AppCompatActivity() {
    private lateinit var view11: TextView
    private lateinit var view12: TextView
    private lateinit var view13: TextView
    private lateinit var view21: TextView
    private lateinit var view22: TextView
    private lateinit var view23: TextView
    private lateinit var view31: TextView
    private lateinit var view32: TextView
    private lateinit var view33: TextView
    private lateinit var changeButton: Button
    private var counter = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        view11 = findViewById(R.id.textView11)
        view12 = findViewById(R.id.textView12)
        view13 = findViewById(R.id.textView13)
        view21 = findViewById(R.id.textView21)
        view22 = findViewById(R.id.textView22)
        view23 = findViewById(R.id.textView23)
        view31 = findViewById(R.id.textView31)
        view32 = findViewById(R.id.textView32)
        view33 = findViewById(R.id.textView33)
        changeButton = findViewById(R.id.button1)

        changeButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                counter++
                if (counter > 3) {
                    counter = 1
                }

                when (counter) {
                    1 -> {
                        view11.text = "1"
                        view12.text = ""
                        view13.text = ""
                        view21.text = "1"
                        view22.text = ""
                        view23.text = ""
                        view31.text = "1"
                        view32.text = ""
                        view33.text = ""
                    }

                    2 -> {
                        view11.text = ""
                        view12.text = "2"
                        view13.text = ""
                        view21.text = ""
                        view22.text = "2"
                        view23.text = ""
                        view31.text = ""
                        view32.text = "2"
                        view33.text = ""
                    }

                    3 -> {
                        view11.text = ""
                        view12.text = ""
                        view13.text = "3"
                        view21.text = ""
                        view22.text = ""
                        view23.text = "3"
                        view31.text = ""
                        view32.text = ""
                        view33.text = "3"
                    }
                }
            }

        })


    }

}