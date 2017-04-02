package com.example.vinaykl.bs2;

/**
 * Created by Nagarchith Balaji on 10/24/2016.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Patient_Welcome extends AppCompatActivity {
    Button btnSignIn,chat,diet,access,rate,cvs,gtc,viewpris;
    Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);


        btnSignIn = (Button) findViewById(R.id.button);
        diet = (Button)findViewById(R.id.diet);
        access =(Button)findViewById(R.id.access);
        rate =(Button)findViewById(R.id.rate);
        cvs =(Button)findViewById(R.id.cvs);
        gtc =(Button)findViewById(R.id.gtc);
        viewpris =(Button)findViewById(R.id.viewPris);
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Intent intent = new Intent(Patient_Welcome.this, Select.class);
                Bundle b = new Bundle();
                // @ mallikarjun. write a code to send Patient who logs in in the variable patient, next line
                String patient = getIntent().getExtras().getString("patientname");
                b.putString("patient",patient);
                intent.putExtras(b);
                startActivity(intent);
                finish();
            }
        });

        diet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Tab_Healthy_Activity.class);
                startActivity(intent);
            }
        });


        access.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Access_Records_Activity.class);

                Bundle bundle = getIntent().getExtras();
                String val = bundle.getString("PEMAIL");
                intent.putExtra("PEMAIL", val);
                startActivity(intent);

            }
        });
        /**rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Doct_List_Rate_Activity.class);
                Bundle bundle = getIntent().getExtras();
                String val = bundle.getString("PEMAIL");
                intent.putExtra("PEMAIL", val);
                startActivity(intent);
            }
        });**/
        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Payment_Submission.class);
                Bundle bundle = getIntent().getExtras();
                String val = bundle.getString("PEMAIL");
                intent.putExtra("PEMAIL", val);
                startActivity(intent);
            }
        });
        cvs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),CVS_Search_Activity.class);
                startActivity(intent);
            }
        });

        gtc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),CVSStore.class);
                startActivity(intent);
            }
        });

        viewpris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PlaceOrder.class);
                Bundle bundle = getIntent().getExtras();
                String val = bundle.getString("PEMAIL");
                intent.putExtra("PEMAIL", val);
                startActivity(intent);
            }
        });
        Button logout = ((Button) findViewById(R.id.logout));
        logout.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Patient_Welcome.this, Patient_HomeActivity.class)
                        .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                finish();
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });

        /*
        chat = (Button) findViewById(R.id.dirctchat);
        chat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Uri mUri = Uri.parse("smsto:+14804105806");
                Intent mIntent = new Intent(Intent.ACTION_SENDTO, mUri);
                mIntent.setPackage("com.whatsapp");
                mIntent.putExtra("sms_body", "The text goes here");
                mIntent.putExtra("chat",true);
                startActivity(mIntent);
                /** Intent i = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("content://com.android.contacts/data/" + "14804109749@s.whatsapp.net"));
                 i.setPackage("com.whatsapp");
                 startActivity(i);
            }

        });  */
    }
}
