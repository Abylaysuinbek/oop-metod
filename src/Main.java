import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StarTriangle small = new StarTriangle(3);
        System.out.println(small.toString());


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side length of the square: ");
        double sideLength = scanner.nextDouble();

        double area = sideLength * sideLength;
        double perimeter = 4 * sideLength;
        double diagonalLength = Math.sqrt(2) * sideLength;

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal Length: " + diagonalLength);

        scanner.close();

        Temperature temp1 = new Temperature();



    }


    }

