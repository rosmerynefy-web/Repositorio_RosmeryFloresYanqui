/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Final;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class examen {
public static void main(String[] args){
//declarando variables
String cliente;
double compra1,compra2,compra3,tc,pc;
Scanner lectura=new Scanner(System.in);
//entrada de datos
System.out.print("Ingresar nombre del cliente:");
cliente=lectura.next();
System.out.print("Ingresar compra1:");
compra1=lectura.nextDouble();
System.out.print("Ingresar compra2:");
compra2=lectura.nextDouble();
System.out.print("Ingresar compra3:");
compra3=lectura.nextDouble();
//proceso de datos
tc=compra1+compra2+compra3;
pc=tc/3;
//salida de datos
System.out.println("La suma total es:"+tc);
System.out.println("El promedio de compras es:"+pc);
}    
}
