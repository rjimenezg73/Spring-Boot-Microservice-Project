package com.pildoras.poo;

public class Furgoneta extends Coche{
   private int capacidad_carga;
   private int plazas_extras;

   public Furgoneta(int capacidad_carga, int plazas_extras){
      super(); // Llama al constructor de la clase padre
      this.capacidad_carga = capacidad_carga;
      this.plazas_extras = plazas_extras;

   }
}
