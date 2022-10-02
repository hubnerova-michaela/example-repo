package com.mycompany.exampleproject;

import java.util.Scanner;
public class ExampleProject {

    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        System.out.println("Napiste dve cisla" + "(po kazdem zmacknete Enter):");

        int num1, num2;
        num1 = read.nextInt();
        num2 = read.nextInt();
 
        //soucet
        System.out.println(num1 + num2);
        
        //soucin
        System.out.println(num1 * num2);
        
        

       

        
        
    }

    
}

