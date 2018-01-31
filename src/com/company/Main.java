package com.company;
import java.util.Scanner;

public class Main {
    static int[] mas= new int[5];
    static int suma=0;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Masyvas();
        System.out.println("Suma: " + suma);
        Rasymas();
    }

    public static void Masyvas(){

        for (int i=0; i<mas.length; i++){
            System.out.println("Iveskite skaciu: ");
            mas[i]=sc.nextInt();
            suma+=mas[i];
        }
    }

    public static void Rasymas(){
        for (int i=0; i<mas.length; i++){
            System.out.println("Masyvo " + i + " skaitmuo yra "+mas[i]);
        }
    }
}
