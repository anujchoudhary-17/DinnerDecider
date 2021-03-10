package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {


    val foodList= arrayListOf("Indian","Chinese","American","British")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

foodType.text="Indian"
        btnDecide.setOnClickListener{
            val random=Random()
            val randomFood=random.nextInt(foodList.count())
            foodType.text=foodList[randomFood]

        }
        btnAddFood.setOnClickListener{
            addFood()
        }
    }


    fun addFood()
    {
    val newFood=txtAddFood.text.toString()
        foodList.add(newFood)
        txtAddFood.text.clear()
    }
}
