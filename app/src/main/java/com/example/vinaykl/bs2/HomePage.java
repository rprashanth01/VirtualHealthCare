package com.example.vinaykl.bs2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {

    Button btnPatient,btnDoctor,btnRequest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        btnPatient = (Button) findViewById(R.id.buttonPatient);
        btnPatient.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Intent intentSignUP=new Intent(getApplicationContext(),Patient_HomeActivity.class);
                startActivity(intentSignUP);
                finish();
            }
        });

        btnDoctor = (Button) findViewById(R.id.buttonDoctor);
        btnDoctor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Intent intentSignUP=new Intent(getApplicationContext(),Doctor_Home_Activity.class);
                startActivity(intentSignUP);

                finish();
            }

        });
        btnRequest = (Button) findViewById(R.id.buttonRequest);
        btnRequest.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Intent intentReq=new Intent(getApplicationContext(),Req_Blood_Activity.class);
                startActivity(intentReq);
            }
        });

    }
}
