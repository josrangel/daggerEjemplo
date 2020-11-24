package com.josrangel.daggerejemplo;

import javax.inject.Inject;

public class Presenter {

    private final Navigator navigator;
    @Inject
    public Presenter(Navigator navigator) {
        this.navigator = navigator;
    }
}
