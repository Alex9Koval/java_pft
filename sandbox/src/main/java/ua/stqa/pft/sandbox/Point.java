package ua.stqa.pft.sandbox;

public class Point {

    public static void main(String[] args) {

        Root r = new Root(5,3,6,4);

        System.out.println("Расстояние между точками на двумерной плоскости " + "= " +area(r));
    }

    public static double area (Root r){
        return Math.sqrt(Math.pow((r.x2 - r.x1),2 )+ Math.pow((r.y2-r.y1),2));
    }
}
