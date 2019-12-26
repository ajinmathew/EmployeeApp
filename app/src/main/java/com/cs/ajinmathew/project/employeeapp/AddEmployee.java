package com.cs.ajinmathew.project.employeeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class AddEmployee extends AppCompatActivity {
EditText edName,edCode,edDesc,edSalary,edCompName,edPlace,edEmail,edMobile;
Button btnUpload;
Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_add_employee );

        edName=(EditText)findViewById( R.id.empname );
        edPlace=(EditText)findViewById( R.id.empplace );
        edSalary=(EditText)findViewById( R.id.empsalary );
        edDesc=(EditText)findViewById( R.id.empdesignation );
        edCode=(EditText)findViewById( R.id.empcode );
        edEmail=(EditText)findViewById( R.id.empemilid );
        edMobile=(EditText)findViewById( R.id.empmobile );
        edCompName=(EditText)findViewById( R.id.companyname );

        btnUpload=(Button)findViewById( R.id.upload );
        spinner=(Spinner)findViewById( R.id.sp1 );
    }
}
