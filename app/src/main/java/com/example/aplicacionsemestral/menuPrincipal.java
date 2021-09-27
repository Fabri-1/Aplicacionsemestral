package com.example.aplicacionsemestral;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class menuPrincipal extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

    }


    public void registro(View v){
        Intent intent = new Intent(this,registroCuenta.class);
        startActivity(intent);
    }

    public void lista(View v){
        Intent intent=new Intent(this, Lista.class);
        startActivity(intent);
    }
    public void menuNoticia(View v){
        Intent intent = new Intent(this,noticiaMenu.class);
        startActivity(intent);
    }
}