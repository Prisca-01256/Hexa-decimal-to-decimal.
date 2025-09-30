/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.prisca;

/**
 *
 * @author VU-STUDENT
 */
import java.util.Scanner;
public class Hexadecimaldigittodecimalvalue {
    public static void main(System[] args){
        Scanner save = new Scanner(System.in);
        System.out.println("Enter a hexadecimal digit (0-9, A-F):");
        char hexDigit = save.nextLine().toUpperCase(). charAt(0);
        int decimalValue;
        
        if (hexDigit >='0' && hexDigit <='9'){
            decimalValue = hexDigit - '0';
    }
        else if (hexDigit >='A' && hexDigit <='F'){
            decimalValue = 10 + (hexDigit -'A');
    }
        else {
            System.out.println("Invalid hexadecimal digit!");
            return;
    }
    System.out.println("Hexadecimal '" + hexDigit + ", = Decimal: " + decimalValue);
    save.close();
}
}