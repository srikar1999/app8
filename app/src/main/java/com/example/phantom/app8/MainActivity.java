package com.example.phantom.app8;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements TextToSpeech.OnInitListener {

    EditText e;
    Button b;
    TextToSpeech tts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e =(EditText)findViewById(R.id.editText);
        b =(Button)findViewById(R.id.button);
        tts = new TextToSpeech(this,this);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = e.getText().toString();
                Toast.makeText(getApplicationContext(), s, Toast.LENGTH_LONG);
                tts.speak(s,TextToSpeech.QUEUE_ADD,null);

            }
        });

    }

    @Override
    public void onInit(int status) {

    }
}
