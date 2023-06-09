package com.pildoras.poo;

public class Coche {
   private int ruedas;
   private int largo;
   private int ancho;
   private int motor;
   private int peso;

   public Coche(){
      this.ruedas = 4;
      this.largo = 550;
      this.ancho = 200;
      this.motor = 1600;
      this.peso = 500;
   }

   public int getRuedas(){
      return this.ruedas;
   }
}
