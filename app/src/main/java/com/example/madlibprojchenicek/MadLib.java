package com.example.madlibprojchenicek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MadLib extends AppCompatActivity {

    public static final String ADJECTIVE = "adjective";
    public static final String NOUN = "noun";
    public static final String ANIMAL = "animal";
    public static final String NUMBER = "number";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad_lib);

        Intent intent = getIntent();
        String adj = intent.getStringExtra(ADJECTIVE);
        String noun = intent.getStringExtra(NOUN);
        String num = intent.getStringExtra(NUMBER);
        String animal = intent.getStringExtra(ANIMAL);

        String output = "One day Jeff Bezos, the CEO of Amazon decided to start a new company. He called this company " + noun + ". ";
        output += noun + " was a farming company that milked " + adj + " " + animal + "s. " + " The problem was that Jeff only bought " + num + " " + animal + "s. ";
        output += " This was a problem because " + noun + " did not made enough profits. Jeff went bankrupt and bought a small apartment. ";
        output += "He lived there with his " + adj + " " + animal + "s and drank their milk. THE END :)";

        TextView outputText = (TextView) findViewById(R.id.madLib);
        outputText.setText(output);
    }
}
