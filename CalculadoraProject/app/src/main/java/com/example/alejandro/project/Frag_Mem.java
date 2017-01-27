package com.example.alejandro.project;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

import static android.content.Context.MODE_PRIVATE;


public class Frag_Mem extends Fragment {
    double resp=0;
    private double res=0;
    public  double anterior=0;
    private int operacion=0;
    TextView et;
    TextView tv;
    private boolean resultFinal=false;

    public Frag_Mem() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_blank, container, false);
        final View view=inflater.inflate(R.layout.fragment_frag__mem, container, false);
        Button b0=(Button)view.findViewById(R.id.id_btn0);
        Button b1=(Button)view.findViewById(R.id.id_btn1);
        Button b2=(Button)view.findViewById(R.id.id_btn2);
        Button b3=(Button)view.findViewById(R.id.id_btn3);
        Button b4=(Button)view.findViewById(R.id.id_btn4);
        Button b5=(Button)view.findViewById(R.id.id_btn5);
        Button b6=(Button)view.findViewById(R.id.id_btn6);
        Button b7=(Button)view.findViewById(R.id.id_btn7);
        Button b8=(Button)view.findViewById(R.id.id_btn8);
        Button b9=(Button)view.findViewById(R.id.id_btn9);
        Button bans=(Button)view.findViewById(R.id.id_btans);
        Button b1del=(Button)view.findViewById(R.id.id_btdel);
        Button b1div=(Button)view.findViewById(R.id.id_btndiv);
        Button b1igual=(Button)view.findViewById(R.id.id_btnigual);
        Button b1sum=(Button)view.findViewById(R.id.id_btnsum);
        Button b1res=(Button)view.findViewById(R.id.id_btnres);
        Button b1mul=(Button)view.findViewById(R.id.id_btnmul);
        Button b1pi=(Button)view.findViewById(R.id.id_btnpi);
        Button b1pow=(Button)view.findViewById(R.id.id_btpow);
        Button b1punto=(Button)view.findViewById(R.id.id_btpunto);


        et=(TextView) view.findViewById(R.id.id_result);
        tv=(TextView)view.findViewById(R.id.id_mostrar);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultFinal==true){
                    tv.setText("0");
                    et.setText("0");
                    resultFinal=false;
                }
                else {
                    String f = et.getText().toString();
                    String f1 = tv.getText().toString();
                    tv.setText(f1 + "0");
                    et.setText(f + "0");
                }
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultFinal==true){
                    tv.setText("1");
                    et.setText("1");
                    resultFinal=false;
                }
                else {
                    String f=et.getText().toString();
                    String f1=tv.getText().toString();
                    tv.setText(f1+"1");
                    et.setText(f+"1");}
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultFinal==true){
                    tv.setText("2");
                    et.setText("2");
                    resultFinal=false;
                }
                else {
                    String f=et.getText().toString();
                    String f1=tv.getText().toString();
                    tv.setText(f1+"2");
                    et.setText(f+"2");}
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultFinal==true){
                    tv.setText("3");
                    et.setText("3");
                    resultFinal=false;
                }
                else {
                    String f=et.getText().toString();
                    String f1=tv.getText().toString();
                    tv.setText(f1+"3");
                    et.setText(f+"3");}
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultFinal==true){
                    tv.setText("4");
                    et.setText("4");
                    resultFinal=false;
                }
                else {
                    String f=et.getText().toString();
                    String f1=tv.getText().toString();
                    tv.setText(f1+"4");
                    et.setText(f+"4");}
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultFinal==true){
                    tv.setText("5");
                    et.setText("5");
                    resultFinal=false;
                }
                else {
                    String f = et.getText().toString();
                    String f1 = tv.getText().toString();
                    tv.setText(f1 + "5");
                    et.setText(f + "5");
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultFinal==true){
                    tv.setText("6");
                    et.setText("6");
                    resultFinal=false;
                }
                else {
                    String f = et.getText().toString();
                    String f1 = tv.getText().toString();
                    tv.setText(f1 + "6");
                    et.setText(f + "6");
                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultFinal==true){
                    tv.setText("7");
                    et.setText("7");
                    resultFinal=false;
                }
                else {
                    String f = et.getText().toString();
                    String f1 = tv.getText().toString();
                    tv.setText(f1 + "7");
                    et.setText(f + "7");
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultFinal==true){
                    tv.setText("8");
                    et.setText("8");
                    resultFinal=false;
                }
                else {
                    String f = et.getText().toString();
                    String f1 = tv.getText().toString();
                    tv.setText(f1 + "8");
                    et.setText(f + "8");
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultFinal==true){
                    tv.setText("9");
                    et.setText("9");
                    resultFinal=false;
                }
                else {
                    String f = et.getText().toString();
                    String f1 = tv.getText().toString();
                    tv.setText(f1 + "9");
                    et.setText(f + "9");
                }
            }
        });
        b1pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultFinal==true){
                    tv.setText("3.141592");
                    et.setText("3.141592");
                    resultFinal=false;
                }
                else {
                    String f=et.getText().toString();
                    String f1=tv.getText().toString();
                    tv.setText(f1+"3.141592");
                    et.setText(f+"3.141592");
                }



            }
        });
        b1punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String f=et.getText().toString();
                String f1=tv.getText().toString();
                if(f.indexOf('.')==-1) {
                    if (f==null){
                        tv.setText("0.");
                        et.setText("0.");
                    }
                    else{
                        tv.setText(f1 + ".");
                        et.setText(f + ".");}


                }
            }
        });
        b1del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String f=et.getText().toString();
                String f1=tv.getText().toString();
                if(f.length()!=0) {
                    tv.setText(f1.substring(0, f1.length() - 1));
                    et.setText(f.substring(0, f.length() - 1));
                }


            }
        });

        b1sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String f = et.getText().toString();
                String f1 = tv.getText().toString();
                if (f.length() != 0) {
                    anterior = Double.parseDouble(f);
                    et.setText("");
                    tv.setText(f1 + " + ");
                    if (operacion != 0)
                        operar();
                } else {
                    if (f1.length() > 3)
                        tv.setText(f1.substring(0, f1.length() - 3) + " + ");
                }
                operacion = 1;
            }

        });
        b1res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String f = et.getText().toString();
                String f1 = tv.getText().toString();
                if (f.length() != 0) {
                    anterior = Double.parseDouble(f);
                    et.setText("");
                    tv.setText(f1 + " - ");
                    if (operacion != 0)
                        operar();
                } else {
                    if (f1.length() > 3) {
                        tv.setText(f1.substring(0, f1.length() - 3) + " - ");
                    }
                }
                operacion = 2;
            }

        });
        b1mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String f = et.getText().toString();
                String f1 = tv.getText().toString();

                if (f.length() != 0) {
                    anterior = Double.parseDouble(f);
                    et.setText("");
                    tv.setText(f1 + " x ");
                    ;
                    if (operacion != 0)
                        operar();
                } else {
                    if (f1.length() > 3)
                        tv.setText(f1.substring(0, f1.length() - 3) + " x ");

                }
                operacion = 3;

            }

        });
        b1div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String f = et.getText().toString();
                String f1 = tv.getText().toString();
                if (f != null) {
                    anterior = Double.parseDouble(f);
                    et.setText("");
                    tv.setText(f1 + " / ");

                    if (operacion != 0)
                        operar();
                } else {
                    if (f1.length() > 3)
                        tv.setText(f1.substring(0, f1.length() - 3) + " / ");

                }
                operacion = 4;
            }
        });
        bans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultFinal == true) {
                    tv.setText(anterior + "");
                    et.setText(anterior + "");
                    resultFinal = false;
                } else {
                    String f = et.getText().toString();
                    String f1 = tv.getText().toString();
                    tv.setText(f1 + anterior);
                    et.setText(f + anterior);
                }
            }
        });
        b1pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String f = et.getText().toString();
                String f1 = tv.getText().toString();
                if (f != null) {
                    anterior = Double.parseDouble(f);
                    et.setText("");
                    tv.setText(f1 + " ^ ");
                    if (operacion != 0)
                        operar();
                } else {
                    if (f1.length() > 3)
                        tv.setText(f1.substring(0, f1.length() - 3) + " ^ ");
                }
                operacion = 5;



            }
        });

        b1igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operacion!=0) {
                    operar();
                    operacion = 0;
                    resultFinal = true;
                }

                File outDir = getActivity().getExternalFilesDir(null);
                //String name=editText.getText().toString();
                //if(!name.equals("example.txt")){
                //   textView.setText("name invalid");
                Scanner scan = null;
                String allText="";
                try {
                    scan = new Scanner(getActivity().openFileInput("out.txt"));
                    allText = "";
                    while (scan.hasNextLine()) {
                        String line = scan.nextLine();
                        allText += line + '\n';
                    }

                    scan.close();

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }




                PrintStream output = null;
                try {

                    output = new PrintStream(getActivity().openFileOutput("out.txt", MODE_PRIVATE));
                    output.println(allText+resp+"");

                    output.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }



            }
        });


        return view;
    }


    public void operar(){

        double f=Double.parseDouble(et.getText().toString());

        switch (operacion) {
            case 1:{
                resp=anterior+f;
                anterior=resp;
                break;
            }

            case 2:{
                resp=anterior-f;
                anterior=resp;
                break;
            }
            case 3:{
                resp=anterior*f;
                anterior=resp;
                break;
            }
            case 4:{
                resp=anterior/f;
                anterior=resp;
                break;
            }
            case 5:{
                resp=Math.pow(anterior,f);
                anterior=resp;
                break;
            }

        }

        tv.setText(String.valueOf(resp));
        et.setText(String.valueOf(""));
    }



}
