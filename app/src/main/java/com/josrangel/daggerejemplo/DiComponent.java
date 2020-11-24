package com.josrangel.daggerejemplo;

import androidx.appcompat.app.AppCompatActivity;

import dagger.Component;

@Component
public interface DiComponent {
    void inject(AppCompatActivity myClass);
}
