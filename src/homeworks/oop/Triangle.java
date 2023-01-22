package homeworks.oop;

//Описать класс Треугольник. В качестве свойств возьмите длины сторон треугольника.
//Реализуйте метод, который будет возвращать площадь этого треугольника. Создайте
//несколько объектов этого класса и протестируйте их.

public class Triangle {

    private double side1;
    private double side2;
    private double side3;


    public Triangle(double side1, double side2, double side3) {
        this(side1, side2);
        this.side3 = side3;
    }

    public Triangle(double side1, double side2) {
        this(side1);
        this.side2 = side2;
    }

    public Triangle(double side1) {
        this.side1 = side1;
    }

    public Triangle() {
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }


    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", Squre=" + squaretriangle() +
                '}';
    }

    public double squaretriangle (){
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }


}
