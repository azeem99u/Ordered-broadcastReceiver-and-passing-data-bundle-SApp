package com.example.android.orderedbroadcastsenderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(view -> {
            Intent intent = new Intent("com.example.android.orderedbroadcastreceiverapp_ACTION");
            //explicit as implicit BR
            intent.setPackage("com.example.android.orderedbroadcastreceiverapp");
            Bundle bundle = new Bundle();
            bundle.putString("message_key", "Start");
            sendOrderedBroadcast(intent, null, new MyReceiver(), null, RESULT_CANCELED, "Start", bundle);
        });
    }
}