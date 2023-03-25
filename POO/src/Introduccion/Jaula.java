package Introduccion;

import Principal.Animal;

public class Jaula {
  public static void main(String[] args) {
    Animal tigre=new Animal();
    tigre.setRaza("blanco");
    System.out.println(tigre.getRaza());
  }
}