package com.rvelasquez.cl1_rogervelasquez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.rvelasquez.cl1_rogervelasquez.view.CrearUsuarioActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goCrearUsuario(View view){

        Intent intent = new Intent(this, CrearUsuarioActivity.class);
        startActivity(intent);

    }
}