package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name = (EditText) findViewById(R.id.lg_name);
        Password =(EditText) findViewById(R.id.lg_password);
        login = (Button) findViewById(R.id.lg_button);


    }

    public void Logging(View btn){
        if(Name.getText().toString().isEmpty() || Password.getText().toString().isEmpty()){
            Toast.makeText(MainActivity.this, "Name and Password must be filled", Toast.LENGTH_SHORT).show();
        }
        else{

            Intent intent = new Intent(MainActivity.this,Home.class);
            startActivity(intent);
        }

    }

    public  void Registerpage(View view){
        Intent intent = new Intent(MainActivity.this,Register.class);
        startActivity(intent);
    }
}