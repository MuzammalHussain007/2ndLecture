package com.example.a2ndlecture;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Dashboard extends AppCompatActivity {
    private static final String FILE_NAME = "Myfile";
    private TextView mName,mPassword,mEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        setJavaXmlConnection();
        getVaueFromSharedPreference();
        gettingInformation();
        SharedPreferences preferences= getSharedPreferences(FILE_NAME,MODE_PRIVATE);
        String Name= preferences.getString("name","value1");
//       String Pass= preferences.getString("password","value1");
//       String email= preferences.getString("email","value1");
        mName.setText(Name);
        Toast.makeText(getApplicationContext(),"Name is "+Name,Toast.LENGTH_LONG).show();
    }

    private void getVaueFromSharedPreference() {



    }

    private void gettingInformation() {
//        mName.setText(""+getIntent().getExtras().getString("Name"));
//        mEmail.setText(""+getIntent().getExtras().getString("Email"));
//        mPassword.setText(""+getIntent().getExtras().getString("Password"));

    }

    private void setJavaXmlConnection() {
        mName=(TextView) findViewById(R.id.nameview);
        mPassword=(TextView) findViewById(R.id.Passwordview);
        mEmail=(TextView) findViewById(R.id.Emailview);

    }
}