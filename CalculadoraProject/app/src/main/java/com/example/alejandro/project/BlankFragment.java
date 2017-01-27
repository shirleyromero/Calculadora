package com.example.alejandro.project;


import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;




/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_blank, container, false);
        View view=inflater.inflate(R.layout.fragment_blank, container, false);
        final Button but= (Button)view.findViewById(R.id.id_butVerH);
        if (getResources().getConfiguration().orientation ==
                Configuration.ORIENTATION_LANDSCAPE) {

                    Toast.makeText(getContext()," ",Toast.LENGTH_LONG).show();

                    Frag_Mem b= (Frag_Mem) getActivity().getSupportFragmentManager().findFragmentById(R.id.id_fragmentMem);
                    but.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent= new Intent(getContext(),act_hist.class);
                            getActivity().startActivity(intent);
                        }
                    });




            //b.setImagen(but.getDrawable());

        }else{
            but.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Intent intent= new Intent(getContext(),Act_02.class);

                    //getActivity().startActivity(intent);
                }
            });
        }



        // Inflate the layout for this fragment
        return view;
    }



}
