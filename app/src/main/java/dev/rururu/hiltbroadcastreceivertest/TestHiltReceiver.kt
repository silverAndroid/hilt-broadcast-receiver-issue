package dev.rururu.hiltbroadcastreceivertest

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class TestHiltReceiver : BroadcastReceiver() {
    @Inject lateinit var injectableClass: InjectableClass

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        Log.d("TestHiltReceiver", "injected ${injectableClass.value}")
    }
}