package com.example.alejandro.project;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class act_hist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_hist);
        TextView textView=(TextView)findViewById(R.id.id_hist);

        File outDir = getExternalFilesDir(null);
        //String name=editText.getText().toString();
        //if(!name.equals("example.txt")){
         //   textView.setText("name invalid");
        Scanner scan = null;
        try {
            scan = new Scanner(openFileInput("out.txt"));
            String allText = "";
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                allText += line + '\n';
            }
            textView.setText(allText);
            scan.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }


    }

