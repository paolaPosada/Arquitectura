package com.company;
import Backend.MotorCalculo;
import Model.Sumando;
import Frontend.ViewOpe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int a = reader.nextInt();
        System.out.println("Ingrese el segundo numero");
        int b = reader.nextInt();
        ViewOpe valores = new ViewOpe().obtener(a,b);
    }

}
