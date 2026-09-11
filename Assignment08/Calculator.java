class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        Calculator obj = new Calculator();

        System.out.println("Addition of two integers: " + obj.add(10, 20));

        System.out.println("Addition of three integers: " + obj.add(10, 20, 30));

        System.out.println("Addition of two decimal numbers: " + obj.add(10.5, 20.5));
 }
 }
