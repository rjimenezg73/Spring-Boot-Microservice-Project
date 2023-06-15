package com.pildoras.poo;

public class Uso_Vehiculo {
   public static void main(String[] args) {
      Coche renault = new Coche();
      //renault.ruedas = 3;
      System.out.println("Éste coche tiene " + renault.getRuedas() + " ruedas.");
      renault.setColor("Blanco");
      System.out.println("El color del coche es " + renault.getColor());

      // Objeto Furgoneta
      Coche miCoche1 = new Coche();
      miCoche1.setColor("Rojo");

      Furgoneta miFurgoneta1 = new Furgoneta(580, 7);
      miFurgoneta1.setColor("Blanca");
      System.out.println(miFurgoneta1.dameDatosFurgoneta());
   }
}
