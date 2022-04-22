package com.example.backgroudtask3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{
            val runnable = Woker()
            val thread = Thread(runnable)
            thread.start()
        }
    }
    inner class Woker : Runnable {
        override fun run() {
            killSomeTime()
        }
    }
    private fun killSomeTime() {
        for (i in 1..20){
            Thread.sleep(2000)
            println("i: $i")
        }
    }
}