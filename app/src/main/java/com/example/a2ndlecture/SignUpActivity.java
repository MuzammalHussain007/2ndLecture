package com.example.a2ndlecture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {
    private static final String FILE_NAME = "Myfile";
    private static final String GET_NAME ="Name" ;
    private EditText mName,mPassword,mEmail;
    private Button mSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        setJavaXmlConnection();
        PassingInformationThroughSharedPreference();
        gettingInformation();
        mSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpActivity.this,Dashboard.class);
                intent.putExtra("Name",mName.getText().toString());
                intent.putExtra("Email",mEmail.getText().toString());
                intent.putExtra("Password",mPassword.getText().toString());
                startActivity(intent);

            }
        });
    }

    private void PassingInformationThroughSharedPreference() {
        SharedPreferences preferences= getSharedPreferences(FILE_NAME,MODE_PRIVATE);
        SharedPreferences.Editor editor=preferences.edit();
        String n=mName.getText().toString();
        editor.putString(GET_NAME,n);
//        editor.putString("password",mPassword.getText().toString());
//        editor.putString("email",mEmail.getText().toString());

    }

    private void changeIntent() {

    }

    private void gettingInformation() {
        Demo.firstname=mName.getText().toString();
        Demo.password=mPassword.getText().toString();
        Demo.email=mEmail.getText().toString();
    }

    private void setJavaXmlConnection() {
        mName=(EditText) findViewById(R.id.FirstName);
        mPassword=(EditText) findViewById(R.id.editTextTextPassword);
        mEmail=(EditText) findViewById(R.id.Email);
        mSignUp=(Button) findViewById(R.id.button);
    }
}
