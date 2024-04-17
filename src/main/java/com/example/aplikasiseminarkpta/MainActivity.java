package com.example.aplikasiseminarkpta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nip, password;
    Button buttonlogin;

    private String NIP ="123456789";
    private String Password = "admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nip = (EditText) findViewById(R.id.editTextNIP);
        password = (EditText) findViewById(R.id.editTextPW);
        Button buttonLogin = findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nip.getText().toString().equalsIgnoreCase(NIP) && password.getText().toString().equalsIgnoreCase(Password)){
                    Intent i = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(i);

                    Toast.makeText(MainActivity.this, "Login Success", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "NIP or Password is incorrect", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }


}