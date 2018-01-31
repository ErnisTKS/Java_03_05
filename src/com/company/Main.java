package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main objektas = new Main();
    }

    public Main(){
        Scanner sc = new Scanner(System.in);
        int[] mas= new int[5];
        int suma=0;
        for (int i=0; i<mas.length; i++){
            System.out.println("Iveskite skaciu: ");
            mas[i]=sc.nextInt();
            suma+=mas[i];
        }
        System.out.println("Suma: " + suma);
        for (int i=0; i<mas.length; i++){
            System.out.println("Masyvo " + i + " skaitmuo yra "+mas[i]);
        }
    }
}
