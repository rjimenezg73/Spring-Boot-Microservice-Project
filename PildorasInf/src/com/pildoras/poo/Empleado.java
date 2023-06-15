package com.pildoras.poo;

import java.util.GregorianCalendar;

public class Empleado {
   private String nombre;
   private double sueldo;
   private int anio;
   private int mes;
   private int dia;

   public Empleado(String nombre) {
      this.nombre = nombre;
      this.sueldo = 30000;
      this.anio = 1973;
      this.mes = 2;
      this.dia = 7;
   }

   public Empleado(String nombre, double sueldo, int anio, int mes, int dia) {
      this.nombre = nombre;
      this.sueldo = sueldo;
      GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
      this.anio = anio;
      this.mes = mes;
      this.dia = dia;
   }
}
