package com.example.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class LogoutReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val prefManager = PrefManager.getInstance(context!!)
        prefManager.saveUsername("")
        prefManager.savePassword("")
        val intent = Intent(context, LoginActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        context.startActivity(intent)
    }
}