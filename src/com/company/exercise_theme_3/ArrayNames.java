package com.company.exercise_theme_3;

public class ArrayNames {

    public static void main(String[] args) {

        String[] names = {"Luis", "XV", "de", "Francia", "Bien", "Amado"};
        StringBuilder name = new StringBuilder();
        for(String nombre : names){
            if(name.length() == 0){
                name = new StringBuilder(nombre);
                continue;
            }
            name.append(" ").append(nombre);
        }
        System.out.println(name);
    }
}
