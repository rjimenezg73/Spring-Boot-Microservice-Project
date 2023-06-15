package com.pildoras.enumerados;

// Las enumeraciones se utilizan para asegurar que en una variable solo se puedan usar un determinado
// numero de valores, es decir, se definen los valores permitidos por la variable
// La variables de tipo enum permiten realizar variables objeto
// Los tipos de datos enum no pueden ser utilizados dentro de la clase main()

// Los tipo enumerados permiten el uso de constructores y de métodos setters y getters


import java.util.Scanner;

public class Uso_tallas {
   enum Talla{MINI, MEDIANO, GRANDE, MUY_GRANDE};
   enum Talla2{
      MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
      private String abreviatura;

      private Talla2(String abreviatura){
         this.abreviatura = abreviatura;
      }

      public String getAbreviatura() {
         return abreviatura;
      }

      // En realidad ésto lo hicimos dentro del constructor
      public void setAbreviatura(String abreviatura) {
         this.abreviatura = abreviatura;
      }
   }

   public static void main(String[] args) {
      Talla s = Talla.MINI;
      Talla m = Talla.MEDIANO;
      Talla l = Talla.GRANDE;
      Talla xl = Talla.MUY_GRANDE;

      Scanner entrada = new Scanner(System.in);

      System.out.println("Escribe una talla: (MINI, MEDIANO, GRANDE, MUY_GRANDE)");
      String entrada_datos = entrada.next().toUpperCase();

      Talla2 la_talla = Enum.valueOf(Talla2.class, entrada_datos);
      System.out.println("Talla: " + la_talla);
      System.out.println("Abreviatura: " + la_talla.getAbreviatura());


   }
}
