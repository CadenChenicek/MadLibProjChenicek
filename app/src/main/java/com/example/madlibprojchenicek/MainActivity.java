package com.example.madlibprojchenicek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendInfo(View v){

        EditText adj = (EditText) findViewById(R.id.adjText);
        EditText noun = (EditText) findViewById(R.id.nounText);
        EditText num = (EditText) findViewById(R.id.numText);
        EditText animal = (EditText) findViewById(R.id.animalText);

        String adjString = adj.getText().toString();
        String nounString = noun.getText().toString();
        String numString = num.getText().toString();
        String animalString = animal.getText().toString();

        Intent intent = new Intent(this, MadLib.class);

        intent.putExtra(MadLib.ADJECTIVE, adjString);
        intent.putExtra(MadLib.NOUN, nounString);
        intent.putExtra(MadLib.NUMBER, numString);
        intent.putExtra(MadLib.ANIMAL, animalString);

        startActivity(intent);


    }
}
