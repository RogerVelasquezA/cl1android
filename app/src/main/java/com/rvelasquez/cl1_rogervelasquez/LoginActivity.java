package com.rvelasquez.cl1_rogervelasquez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.rvelasquez.cl1_rogervelasquez.view.ContainerActivity;
import com.rvelasquez.cl1_rogervelasquez.view.CrearUsuarioActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setTheme(R.style.splashTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goCrearUsuario(View view){

        Intent intent = new Intent(this, CrearUsuarioActivity.class);
        startActivity(intent);

    }

    public void goLista(View view){

        Intent intent = new Intent(this, ContainerActivity.class);
        startActivity(intent);

    }
}