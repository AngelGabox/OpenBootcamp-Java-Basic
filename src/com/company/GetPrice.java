package com.company;
import java.util.Scanner;

public class GetPrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the price");
        double price = getTotal(scanner.nextInt());
        System.out.println("Price is " + price);
    }
    public static double getTotal ( int price){
        return price + (price * 0.10);
    }
}
