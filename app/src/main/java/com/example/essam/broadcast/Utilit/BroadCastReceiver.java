package com.example.essam.broadcast.Utilit;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.util.Log;
import android.widget.Toast;

public class BroadCastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            Toast.makeText(context, "Boot Completed", Toast.LENGTH_LONG).show();
            Log.d("ESSAM","Change");
        }
        if (ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction())) {
            Toast.makeText(context, "Connectivity Change", Toast.LENGTH_LONG).show();
            Log.d("ESSAM","Change");
        }

    }
}
