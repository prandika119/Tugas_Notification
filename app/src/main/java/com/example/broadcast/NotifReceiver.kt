package com.example.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class NotifReceiver:BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val msg = intent?.getStringExtra("msg")
        if(msg!=null){
            Toast.makeText(context, "msg", Toast.LENGTH_SHORT).show()
        }
    }
}