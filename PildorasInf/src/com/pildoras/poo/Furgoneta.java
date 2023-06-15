package com.pildoras.poo;

public class Furgoneta extends Coche{
   private int capacidad_carga;
   private int plazas_extra;

   public Furgoneta(int capacidad_carga, int plazas_extra){
      super(); // Llama al constructor de la clase padre
      this.capacidad_carga = capacidad_carga;
      this.plazas_extra = plazas_extra;
   }

   public int getCapacidad_carga() {
      return capacidad_carga;
   }

   public void setCapacidad_carga(int capacidad_carga) {
      this.capacidad_carga = capacidad_carga;
   }

   public int getPlazas_extra() {
      return plazas_extra;
   }

   public void setPlazas_extra(int plazas_extra) {
      this.plazas_extra = plazas_extra;
   }

   public String dameDatosFurgoneta(){
      return "La capacidad de carga es: " + this.getCapacidad_carga() + " Y las plazas son: " + this.getPlazas_extra();
   }
}
