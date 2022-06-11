package com.example.gpafinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{
    //double[] gpa = {5.0,6.0,7.0,8.0,9.0,10.0};
    private Spinner GpaSpinner1;
    private Spinner GpaSpinner2;
    private Spinner GpaSpinner3;
    private Spinner GpaSpinner4;
    private Spinner GpaSpinner5;
    double sub1  = 0;
    double sub2  = 0;
    double sub3  = 0;
    double sub4  = 0;
    double sub5  = 0;
    private  TextView finalGpa; //(TextView)findViewById(R.id.);

//    @Override
//    public void onClick(View v) {
//        //finalGpa.setText("YOUR GPA IS: " );
//        switch(v.getId()){
//            case (R.id.btnSubmit1):
//                finalGpa.setText("YOUR GPA IS: ");
//        }
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GpaSpinner1 = findViewById((R.id.spinner1));
        GpaSpinner2 = findViewById((R.id.spinner2));
        GpaSpinner3 = findViewById((R.id.spinner3));
        GpaSpinner4 = findViewById((R.id.spinner4));
        GpaSpinner5 = findViewById((R.id.spinner5));
        ArrayList<Double> Gpa = new ArrayList<>();
        Gpa.add(6.0);
        Gpa.add(7.0);
        Gpa.add(8.0);
        Gpa.add(9.0);
        Gpa.add(10.0);

        ArrayAdapter<Double> GpaAdapter1 = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                Gpa
        );
        GpaSpinner1.setAdapter(GpaAdapter1);
        ArrayAdapter<Double> GpaAdapter2 = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                Gpa
        );
        GpaSpinner2.setAdapter(GpaAdapter2);
        ArrayAdapter<Double> GpaAdapter3 = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                Gpa
        );
        GpaSpinner3.setAdapter(GpaAdapter3);
        ArrayAdapter<Double> GpaAdapter4 = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                Gpa
        );
        GpaSpinner4.setAdapter(GpaAdapter4);
        ArrayAdapter<Double> GpaAdapter5 = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                Gpa
        );
        GpaSpinner5.setAdapter(GpaAdapter5);


        GpaSpinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, Gpa.get(position)  + "Selected",Toast.LENGTH_SHORT).show();
                sub1 = Gpa.get(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        GpaSpinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, Gpa.get(position)  + "Selected",Toast.LENGTH_SHORT).show();
                sub2 = Gpa.get(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        GpaSpinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, Gpa.get(position)  + "Selected",Toast.LENGTH_SHORT).show();
                sub3 = Gpa.get(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        GpaSpinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, Gpa.get(position)  + "Selected",Toast.LENGTH_SHORT).show();
                sub4 = Gpa.get(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        GpaSpinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, Gpa.get(position)  + "Selected",Toast.LENGTH_SHORT).show();
                sub5 = Gpa.get(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        Button btn = findViewById(R.id.BtnSubmit);
        double ans = (sub1+sub2+sub3+sub4+sub5)/5;
        finalGpa = (TextView)findViewById(R.id.finalGpaid);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finalGpa.setText("YOUR GPA IS: " + (sub1+sub2+sub3+sub4+sub5)/5);
                //Toast.makeText(MainActivity.this,"BUTTON CLICKED",Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}