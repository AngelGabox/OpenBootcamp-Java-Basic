package com.company.exercise_theme_5;

public class Main {

    public static void main(String[] args){
        CocheCRUD coche = new CocheCRUDimpl();

        coche.save();
        coche.findAll();
        coche.delete();
    }
}