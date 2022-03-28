package com.melatech.capgeminidiceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun newDiceRoll(v: View){

        var countersArr = arrayOf(-1, 0, 0, 0, 0, 0, 0)

        for(i in 1..1_000_000) {
            countersArr[Random.nextInt(1, 7)]++
        }
        for (i in 1..countersArr.size-1){
            println("MY DICE | $i is ${countersArr[i]}")
        }
    }
}