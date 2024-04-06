package com.jz;

public class Main {
  public static void main(String[] args) throws Exception {
    // Tworzenie obiektu klasy Point i inicjowanie wartościami
    Point point = new Point(3.5, 2.0);
    System.out.println("Point x: " + point.getX());
    System.out.println("Point y: " + point.getY());
  }
}