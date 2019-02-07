package ua.stqa.pft.sandbox;

public class Point {

    public static void main(String[] args) {
        double x = 5.6;
        double y = 6.5;
        double a = Math.sqrt(5.6 * 6.5);

        System.out.println("Представления точек на двумерной плоскости с их координатами "  + x + " и " + y + " = " + sqrt(x,y)   );
    }

    public static double sqrt (double x, double y){
        return x * y;
    }
    // AB = √AC2 + BC2
}
