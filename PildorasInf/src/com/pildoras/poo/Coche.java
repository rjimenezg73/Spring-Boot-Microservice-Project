package com.pildoras.poo;

public class Coche {
   private int ruedas;
   private int largo;
   private int ancho;
   private int motor;
   private int peso;
   private String color;
   private int peso_total;
   private boolean asientos_cuero, climatizador;

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

   public void setRuedas(int ruedas) {
      this.ruedas = ruedas;
   }

   public int getLargo() {
      return largo;
   }

   public void setLargo(int largo) {
      this.largo = largo;
   }

   public int getAncho() {
      return ancho;
   }

   public void setAncho(int ancho) {
      this.ancho = ancho;
   }

   public int getMotor() {
      return motor;
   }

   public void setMotor(int motor) {
      this.motor = motor;
   }

   public int getPeso() {
      return peso;
   }

   public void setPeso(int peso) {
      this.peso = peso;
   }

   public void setColor(String color){
      this.color = color;
   }

   public String getColor(){
      return this.color;
   }
}
