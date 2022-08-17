package com.company.exercises_themes_7_8_9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {

        //.1
//        exerciseOne();
//            printSpace();
//        //.2
//        exerciseTwo();
//            printSpace();
//        //.3
//        exerciseThree();
//            printSpace();
//        //.4
////        exerciseFour();
//            printSpace();
//        //.5
        exerciseFive();
//            printSpace();
//        //.6
//        exerciseSix();
//            printSpace();
        //.7
        dividePorCero();
        printSpace();
        System.out.println(55%5==0);
        String var = "21";
        Integer num = Integer.parseInt(var);
        System.out.println(num.getClass());
        System.out.println(var instanceof String);



    }

    public static void exerciseOne() {
        System.out.println("1.Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.");
            printSpace();
        String[] arrayStrg = { "Actualizar", "Bien", "Create", "Delete" };
        for (String valor: arrayStrg) {System.out.println(valor);}
    }

    public static void exerciseTwo() {
        System.out.println("2.Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.");
            printSpace();
        int[][] arrayInt = {
                { 10, 20, 30 },
                { 20, 30, 40 },
                { 30, 40, 50 },
                { 40, 50, 60 }
        };
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++){
                System.out.println("Posición: [" + i + "][" + j + "] y el contenido es igual a: " + arrayInt[i][j]);
            }
        }
    }
    public static void exerciseThree(){
        System.out.println("3.Crea un \"Vector\" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.");
        System.out.println(" ");
        Vector<String> vector = new Vector<>(5, 5);
        vector.add("Angel");
        vector.add("Bolivar");
        vector.add("Carlos");
        vector.add("Dario");
        vector.add("Edgar");
        vector.remove(1);
        vector.remove(2);
        System.out.println("valor final del vector: " + vector);
    }

    public static void exerciseFive() {
        System.out.println("5.Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.");
        List<String> list = new ArrayList<>();
        list.add("Character");
        list.add("Add");
        list.add("Boolean");
        list.add("Data");
        LinkedList<String> listaEnlazada = new LinkedList<>(list);
        for (int i = 0; i < list.size(); i++) {
            printSpace();
            System.out.println("Elemento en la posición "+ i +" en la lista normal:   <-- " + list.get(i) +" -->");
            System.out.println("Elemento en la posición "+ i +" en la lista enlazada: <-- " + listaEnlazada.get(i) + " -->");
        }
        printSpace();
        printSpace();
        list.stream().sorted((s1, s2)->s1.compareTo(s2)).collect(Collectors.toList());
        System.out.println(list);
    }

    public static void exerciseSix() {
        System.out.println("6.Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer \"for\" de relleno.");
        printSpace();
        ArrayList<Integer> listInt = new ArrayList<>();
        for (int i = 1; i < 15; i++) {
            if(i%2 != 0){
               listInt.add(i);
            }
        }
        System.out.println("Resultado de ArrayList de enteros : " + listInt);
    }

    public static void dividePorCero() {
        System.out.println("7.Crea una función DividePorCero. Esta, debe generar una excepción (\"throws\") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde \"main\", por ejemplo). Si se dispara la excepción, mostraremos el mensaje \"Esto no puede hacerse\". Finalmente, mostraremos en cualquier caso: \"Demo de código\".");
        printSpace();
        try {
            int a = 10;
            int b = 0;
            int resultado = a / b;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("¡Esto no se puede hacerse!");
        }finally{
            System.out.println("    Demo");
            System.out.println("int a = 10;");
            System.out.println("int b = 0;");
            System.out.println("int resultado = a / b;");
        }
    }

    public static void exerciseEight(String fileIn, String fileOut) {
        System.out.println("Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: \"fileIn\" y \"fileOut\". La tarea de la función será realizar la copia del fichero dado en el parámetro \"fileIn\" al fichero dado en \"fileOut\".");
        printSpace();
        try{
            InputStream fichero = new FileInputStream(fileIn);
        }catch (FileNotFoundException e){
            System.out.println("error" + e.getMessage());
        }


    }
    public static void printSpace() {System.out.println(" ");}

}
