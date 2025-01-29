public class ShapeAreaCalculator{
    public double calculateArea(double length, double width){  //Rectangle
        return length*width; 
    }
    
    public double calculateArea(double side){  //Sqaure
        return side*side;
    }

    public double calculateArea(double radius, boolean isCircle){   //Circle
        return 3.14*radius*radius; 
    }

    public double calculateArea(double base, double height, boolean isTriangle){   //Triangle
        return 0.5*base*height;
    }

    public static void main(String[] args){
        ShapeAreaCalculator calculator = new ShapeAreaCalculator();

        // Rectangle
        double rectangleArea = calculator.calculateArea(20, 10);
        System.out.println("Area of Rectangle: " + rectangleArea);

        // Square
        double squareArea = calculator.calculateArea(5); 
        System.out.println("Area of Square: " + squareArea);

        // Circle
        double circleArea = calculator.calculateArea(5, true); 
        System.out.println("Area of Circle: " + circleArea);

        // Triangle
        double triangleArea = calculator.calculateArea(4, 6, true);  //as it shows length, width to correct this we have to take a boolean variable
        System.out.println("Area of Triangle: " + triangleArea);
    }
}
