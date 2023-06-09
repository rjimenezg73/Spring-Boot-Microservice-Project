package com.pildoras.fundamentos;

import java.util.Scanner;

public class Entrada_Ejemplo01 {
   public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);

      System.out.println("Introduce tu nombre: ");
      String nombre_usuario = entrada.nextLine();
      System.out.println("Introduce tu edad: ");
      int edad = entrada.nextInt();
      System.out.println("Introduce tu sueldo: $");
      double sueldo = entrada.nextDouble();
      System.out.printf("%s, tiene %d años y tiene un sueldo de $ %.2f pesos", nombre_usuario,edad, sueldo);
   }
}
