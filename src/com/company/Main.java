package com.company;
import java.util.Scanner;

public class Main {

    private int[] mas= new int[5];
    private int suma;


    public static void main(String[] args) {
        Main objektas = new Main();
        objektas.Masyvas();
        objektas.Rasymas();
    }

    public void Masyvas(){
        Scanner sc = new Scanner(System.in);
        mas = new int[5];
        for (int i=0; i<mas.length; i++){
            System.out.println("Iveskite skaciu: ");
            mas[i]=sc.nextInt();
            suma+=mas[i];
        }
    }

    public void Rasymas(){
        for (int i=0; i<mas.length; i++){
            System.out.println("Masyvo " + i + " skaitmuo yra "+mas[i]);
        }
        System.out.println("Suma: " + suma);
    }
}
