package com.pildoras.graficos;

import javax.swing.*;

public class CreandoMarcos {
   public static void main(String[] args) {
      MiMarco marco1 = new MiMarco(700,400);
      marco1.setVisible(true);
      marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}


class MiMarco extends JFrame{
   public MiMarco(int w, int h){
      setSize(w, h);
   }
}