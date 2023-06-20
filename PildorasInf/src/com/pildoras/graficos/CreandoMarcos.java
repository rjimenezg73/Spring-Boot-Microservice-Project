package com.pildoras.graficos;

import javax.swing.*;
import java.awt.*;

public class CreandoMarcos {
   public static void main(String[] args) {
      MiMarco marco1 = new MiMarco(700,400);
      marco1.setVisible(true);
      marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}


class MiMarco extends JFrame{
   public MiMarco(int w, int h){
      //setSize(w, h);
      //setLocation(w-300,h-200);
      setBounds(w-300, h-200, w, h);
      //setResizable(false);
      //setExtendedState(Frame.MAXIMIZED_BOTH);
      setTitle("Utilizando Frames ");
   }
}