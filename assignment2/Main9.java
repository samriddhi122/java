package assignment2;

import java.util.Scanner;

abstract class ThreeDObject {
    abstract double wholeSurfaceArea();
    abstract double volume();
}

class Box extends ThreeDObject {
    double length, width, height;

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    @Override
    double volume() {
        return length * width * height;
    }
}

class Cube extends ThreeDObject {
    double side;

    Cube(double side) {
        this.side = side;
    }

    @Override
    double wholeSurfaceArea() {
        return 6 * side * side;
    }

    @Override
    double volume() {
        return side * side * side;
    }
}

class Cylinder extends ThreeDObject {
    double radius, height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    double volume() {
        return Math.PI * radius * radius * height;
    }
}

class Cone extends ThreeDObject {
    double radius, height;

    Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double wholeSurfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    double volume() {
        return (1.0 / 3) * Math.PI * radius * radius * height;
    }
}

public class Main9 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter length,width and height for the box: ");
        double length =scanner.nextDouble();
        double width=scanner.nextDouble();
        double height=scanner.nextDouble();
        ThreeDObject box = new Box(length, width, height);
        System.out.println("Box Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Box Volume: " + box.volume());

        ThreeDObject cube = new Cube(length);
        System.out.println("Cube Surface Area: " + cube.wholeSurfaceArea());
        System.out.println("Cube Volume: " + cube.volume());

        ThreeDObject cylinder = new Cylinder(3, 5);
        System.out.println("Cylinder Surface Area: " + cylinder.wholeSurfaceArea());
        System.out.println("Cylinder Volume: " + cylinder.volume());

        ThreeDObject cone = new Cone(3, 5);
        System.out.println("Cone Surface Area: " + cone.wholeSurfaceArea());
        System.out.println("Cone Volume: " + cone.volume());
    }
}
