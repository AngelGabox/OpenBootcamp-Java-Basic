package com.company.exercise_theme_4;

public class Main {
    public static void main(String[] args) {

        String[] typesUSB = { "A", "B", "C"};
        SmartPhone Xiaomi = new SmartPhone( 15.5d, 64, 5000, true, true, true, false, true, true, typesUSB[1], 3, true, 32, true, true);
        SmartWatch proMax = new SmartWatch(1.7, 4, 3000, false, true, false, true, true, true, true, false, true, true, true, true);
        System.out.println("//=================//------Xiaomi----------//=========//");
        System.out.println(Xiaomi);
        System.out.println(Xiaomi.in);
        System.out.println(Xiaomi.GPS);
        System.out.println(Xiaomi.mAh);
        System.out.println(Xiaomi.numberCameras);
        System.out.println(Xiaomi.flash);
        System.out.println("//=================//---------proMax----------//=========//");
        System.out.println(proMax);
        System.out.println(proMax.ram);
        System.out.println(proMax.mAh);
        System.out.println(proMax.stereoPort);
        System.out.println(proMax.bluetooth);
        System.out.println(proMax.accelerometer);
    }


}
