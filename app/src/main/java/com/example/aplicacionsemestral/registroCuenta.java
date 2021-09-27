package com.example.aplicacionsemestral;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class registroCuenta extends AppCompatActivity {

    private EditText nombre, apellido, contraseña, correoEscribir;
    private TextInputLayout correo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_cuenta);
        nombre = findViewById(R.id.textNombre);
        apellido = findViewById(R.id.textApellido);
        contraseña = findViewById(R.id.textContraseña);
        correoEscribir = findViewById(R.id.correo);
        correo = findViewById(R.id.inputLayout);


        correoEscribir.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                correo.setErrorEnabled(false);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
    public void crearCuenta(View v){
        if(validar()){
            Toast.makeText(this,"Cuenta creada",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this,"Revise los datos obligatorios",Toast.LENGTH_LONG).show();
        }
    }
    public boolean validar(){
        boolean retorno=true;
        String c1=nombre.getText().toString();
        String c2=apellido.getText().toString();
        String c3=contraseña.getText().toString();
        String c4=correoEscribir.getText().toString();


        if(c1.isEmpty()){
            nombre.setError("Debe ingresar un nombre");
            retorno=false;
        }
        if(c2.isEmpty()){
            apellido.setError("Debe ingresar un apellido");
            retorno=false;
        }
        if(c3.isEmpty()){
            contraseña.setError("Debe ingresar una contraseña");
            retorno=false;
        }
        if(c4.isEmpty()){
            correo.setError("Debe ingresar un correo electronico");
            retorno=false;
        }




        return retorno;
    }
}