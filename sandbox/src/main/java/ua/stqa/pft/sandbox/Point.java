package ua.stqa.pft.sandbox;

public class Point {

    public static void main(String[] args) {
        double x = 5;
        double y = 6;

        System.out.println("Представления точек на двумерной плоскости с их координатами "  + x + " и " + y + " = " + distance(x,y)   );
    }

    public static double distance(double x, double y){
        return x * y;
    }
}
