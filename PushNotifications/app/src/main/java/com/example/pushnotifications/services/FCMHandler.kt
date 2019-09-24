package com.example.pushnotifications.services

import android.util.Log
import androidx.core.app.NotificationCompat
import com.example.pushnotifications.R
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class FCMHandler : FirebaseMessagingService() {
    override fun onNewToken(p0: String) {
        // Send this to the server
        Log.d("##FCM", "token is $p0")
    }
}