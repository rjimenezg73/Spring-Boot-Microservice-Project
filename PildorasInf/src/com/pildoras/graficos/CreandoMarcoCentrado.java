package com.pildoras.graficos;

import javax.swing.*;
import java.awt.*;

public class CreandoMarcoCentrado {
   public static void main(String[] args) {
      MarcoCentrado marco3 = new MarcoCentrado();
      marco3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      marco3.setVisible(true);
   }
}

class MarcoCentrado extends JFrame{
   public MarcoCentrado(){
      Toolkit miPantalla = Toolkit.getDefaultToolkit();
      Dimension tamanioPantalla = miPantalla.getScreenSize();
      int alturaPantalla = tamanioPantalla.height;
      int anchoPantalla = tamanioPantalla.width;
      setSize(anchoPantalla/2,alturaPantalla/2);
      setLocation(anchoPantalla/4,alturaPantalla/4);
      setTitle("Marco Centrado");
      Image miIcono = miPantalla.getImage("C:\\DesarrolloWeb\\Spring-Boot-Microservice-Project\\PildorasInf\\src\\com\\pildoras\\graficos\\icono.png");
      setIconImage(miIcono);
   }
}