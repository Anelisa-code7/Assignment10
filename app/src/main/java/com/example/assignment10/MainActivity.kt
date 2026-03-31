package com.example.assignment10

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity()


{
    //Declaring variables
    lateinit var txtTime: EditText

    lateinit var txtOutput: TextView

    lateinit var btnSuggestion: Button

    lateinit var btnReset: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //Initializing elements by using their IDs
        txtOutput = findViewById(R.id.txtOutput)
        txtTime = findViewById(R.id.txtTime)
        btnReset = findViewById(R.id.btnReset)
        btnSuggestion = findViewById(R.id.btnSuggestion)


        //set an OnClickListener
        btnSuggestion.setOnClickListener {
            val Time = txtTime.text.toString().trim().lowercase()

            //Check if the input is empty
            if (Time.isEmpty()) {
                //if empty,show an error message on the timeInput EditText
                txtTime.error = "Please fill in required information"
            } else {
                if (Time == "Morning") {
                    txtOutput.text = "Check up on your family members "
                } else if
                               (Time == "Mid-morning") {
                    txtOutput.text = "Say a quick thank you to a colleague"
                } else if
                               (Time == "Afternoon") {
                    txtOutput.text = "Send funny memes and links to your friends"
                } else if
                               (Time == "Afternoon Snack Time") {
                    txtOutput.text = " Send a Thinking of you Text"
                } else if
                               (Time == "Dinner") {
                    txtOutput.text =
                        "Have a catch up session for 5 minutes with a friend or family "
                } else if
                               (Time == "After Dinner/Night") {
                    txtOutput.text = "Leave a thoughtful comment on a friends post"
                } else {
                    txtOutput.text = "Invalid time of day. Try: Morning, Afternoon, Dinner"


                }

            }
        }

        //set an OnClickListener for Reset button
        btnReset.setOnClickListener {

            txtTime.text.clear()
            txtOutput.text = ""
        }


            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets;
            }
        }
    }
