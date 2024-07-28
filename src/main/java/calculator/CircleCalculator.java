package calculator;

public class CircleCalculator{
    static double radius;
    public final static double PI = 3.14159;
    public CircleCalculator(){
        this.radius = radius;
    }
    public double getRadius(double radius){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public static double getArea(){
        return PI*radius*radius;
    }
}
