class Maximum {

    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    double max(double a, double b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {

        Maximum obj = new Maximum();

        System.out.println("Maximum between two integers: " + obj.max(10, 20));

        System.out.println("Maximum between three integers: " + obj.max(10, 25, 15));

        System.out.println("Maximum between two decimal numbers: " + obj.max(12.5, 15.8));
    }
}
