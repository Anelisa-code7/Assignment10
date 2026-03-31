package com.example.assignment10

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

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
            val time = txtTime.text.toString().trim().lowercase()


                if (time == "Morning") {
                    txtOutput.setTextColor(getColor(R.color.purple))
                    txtOutput.text = "Check up on your family members "
                } else if (time == "Mid-morning") {
                    txtOutput.text = "Say a quick thank you to a colleague"
                } else if (time == "Afternoon") {
                    txtOutput.text = "Send funny memes and links to your friends"
                } else if (time == "Afternoon Snack Time") {
                    txtOutput.text = " Send a Thinking of you Text"
                } else if (time == "Dinner") {
                    txtOutput.text = "Have a catch up session for 5 minutes with a friend or family "
                } else if (time == "After Dinner/Night") {
                    txtOutput.text = "Leave a thoughtful comment on a friends post"
                } else {
                    txtOutput.text = "Invalid time of day. Try: Morning, Afternoon, Dinner"

                }


        }

        //set an OnClickListener for Reset button
        btnReset.setOnClickListener {

            txtTime.text.clear()
            txtOutput.text = ""
        }




        }
    }
