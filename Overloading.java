import java.util.Scanner;

class Overloading {
    static float area(int r) 
    {
        return 3.14f * r * r; 
    }

    static float area(int l, int b) 
    {
        return l * b; 
    }

    static float area(int a, int b, int c) {
        float s = (a + b + c) / 2f;
        return (float) Math.sqrt(s * (s - a) * (s - b) * (s - c)); 
    }

    public static void main(String args[]) {
        System.out.println("Enter the shape to find the area (1 = circle,2 = rectangle,3 = triangle): ");
        Scanner sc = new Scanner(System.in);
        int shape = sc.nextInt();

        switch (shape)
        {
            case 1:
                System.out.println("Enter the radius of the circle: ");
                int radius = sc.nextInt();
                float circleArea = area(radius);
                System.out.println("Area of the circle: " + circleArea);
                break;

            case 2:
                System.out.println("Enter the length and width of the rectangle: ");
                int length = sc.nextInt();
                int width = sc.nextInt();
                float rectangleArea = area(length, width);
                System.out.println("Area of the rectangle: " + rectangleArea);
                break;

            case 3:
                System.out.println("Enter the lengths of the sides of the triangle: ");
                int side1 = sc.nextInt();
                int side2 = sc.nextInt();
                int side3 = sc.nextInt();
                float triangleArea = area(side1, side2, side3);
                System.out.println("Area of the triangle: " + triangleArea);
                break;

            default:
                System.out.println("Invalid shape!");
                break;
        }
    }
}
