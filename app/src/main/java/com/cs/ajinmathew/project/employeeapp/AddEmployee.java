package com.cs.ajinmathew.project.employeeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddEmployee extends AppCompatActivity {
EditText edName,edCode,edDesc,edSalary,edCompName,edPlace,edEmail,edMobile;
Button btnUpload;
Spinner spinner;
Employee employee;

DatabaseReference databaseReference;
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

        databaseReference= FirebaseDatabase.getInstance().getReference().child( "Employee" );

        btnUpload=(Button)findViewById( R.id.upload );
        spinner=(Spinner)findViewById( R.id.sp1 );

        btnUpload.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                employee=new Employee(  );
                employee.setCode( edCode.getText().toString() );
                employee.setCompany_name( edCompName.getText().toString() );
                employee.setDesignation( edDesc.getText().toString() );
                employee.setSalary( Float.parseFloat( edSalary.getText().toString() ) );
                employee.setPlace( edPlace.getText().toString() );
                employee.setEmilid( edEmail.getText().toString() );
                employee.setName( edName.getText().toString() );
                employee.setMobile( Long.parseLong( edMobile.getText().toString() ) );
                employee.setDistrict( spinner.getSelectedItem().toString() );

                databaseReference.setValue( employee );

                Toast.makeText( getApplicationContext(),"Data Inserted",Toast.LENGTH_LONG ).show();
            }
        } );
    }
}
