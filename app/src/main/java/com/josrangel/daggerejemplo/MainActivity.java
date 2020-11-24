package com.josrangel.daggerejemplo;

/**
 * *Tutorial: https://www.paradigmadigital.com/dev/inyeccion-dependencias-dagger-2/
 * */

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

import dagger.internal.DaggerCollections;

public class MainActivity extends AppCompatActivity {
    @Inject
    Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //hasta que se contruye o compila, es que detecta DaggerDiComponent como una clase valida
        DaggerDiComponent.create().inject(this);
    }
}