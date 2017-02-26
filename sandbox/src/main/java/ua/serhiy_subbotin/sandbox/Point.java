package ua.serhiy_subbotin.sandbox;

import static java.lang.Math.sqrt;

/**
 * Created by TOSHIBA on 20.02.2017.
 */
public class Point {

  public double a;
  public double b;

  public static void main(String[] args) {

    Point p1 = new Point(1, 2);
    Point p2 = new Point(3, 4);

    System.out.println("Расстояние между двумя точками A(" + p1.a + "," + p1.b + ") и B(" + p2.a + "," + p2.b + ") = " + distance(p1, p2));
    System.out.println("Расстояние между двумя точками A(" + p1.a + "," + p1.b + ") и B(" + p2.a + "," + p2.b + ") = " + p2.distance(p1));
  }
    public static double distance(Point p1, Point p2){
    return sqrt(((p2.a - p1.a) * (p2.a - p1.a)) + ((p2.b - p1.b) * (p2.b - p1.b)));
  }

  public double distance(Point p1){
    return sqrt(((this.a - p1.a) * (this.a - p1.a)) + ((this.b - p1.b) * (this.b - p1.b)));
  }

  public Point( double a, double b){
      this.a = a;
      this.b = b;
    }
  }

