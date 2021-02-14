package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Name = (EditText) findViewById(R.id.rg_name);
        Password =(EditText) findViewById(R.id.rg_password);
        register = (Button) findViewById(R.id.rg_button);
    }

    public void Register(View view){
        if(Name.getText().toString().isEmpty() || Password.getText().toString().isEmpty()){
            Toast.makeText(Register.this, "Name and Password must be filled", Toast.LENGTH_SHORT).show();
        }
        else{
            Intent intent=new Intent(Register.this,MainActivity.class);
            startActivity(intent);
            Toast.makeText(Register.this, "Registration Succesfull", Toast.LENGTH_SHORT).show();
        }


    }
}