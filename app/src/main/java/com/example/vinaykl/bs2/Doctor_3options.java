package com.example.vinaykl.bs2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Doctor_3options extends AppCompatActivity {

    String DocName;
    String TableName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_3options);

        DocName =  getIntent().getExtras().getString("Doc");
        TableName = DocName + "_Availability";

        System.out.println(DocName + "  "+ TableName);

        Button Add_Availability = ((Button) findViewById(R.id.AddAvailability));
        Add_Availability.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                // This is where I need the Doc Id Of the doctor via login

                // Rest all will remain the same
                Intent intent = new Intent(Doctor_3options.this, doctorHome.class);
                Bundle b = new Bundle();
                b.putString("Doc",DocName);
                b.putString("Name", TableName);
                intent.putExtras(b);
                startActivity(intent);
                finish();
            }
        });


        Button Show_Records = ((Button) findViewById(R.id.ViewRecords));
        Show_Records.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                // This is where I need the Doc Id Of the doctor via login

                // Rest all will remain the same
                Intent intent = new Intent(Doctor_3options.this, ShowRecords.class);
                Bundle b = new Bundle();
                b.putString("Doc",DocName);
                TableName = DocName+"_access";
                b.putString("Name", TableName);
                intent.putExtras(b);
                startActivity(intent);
                finish();
            }
        });

        Button Sessions = ((Button) findViewById(R.id.Sessions));
        Sessions.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Doctor_3options.this, Doctor_View_Appointments.class);
                Bundle b = new Bundle();
                b.putString("DocName",DocName);
                b.putString("TableName", TableName);
                intent.putExtras(b);
                startActivity(intent);
                finish();
                // Mallikarjun Code
            }
        });
        Button logout = ((Button) findViewById(R.id.logout));
        logout.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Doctor_3options.this, Doctor_Home_Activity.class)
                        .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                finish();
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });


    }
}
