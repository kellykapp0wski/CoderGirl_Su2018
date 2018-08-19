public class Calculator {
    public static int add(int a, int b){
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a , int b) {
        return a * b;
    }
    public static int divide(int a , int b) {
        return a / b;
    }

    public static void main(String[] args){
        // First we call the add function.
        // It take two input parameters which are 5 and 7 here.
        // The return value of add(), which is 12,
        // gets saved in the variable x.
        int x = add(5, 7);

        System.out.println("5 plus 7 equals " + x);

        System.out.println("3 plus 5 equals " + add(3,5));
        System.out.println("1 plus 2 equals " + add(1,2));

        System.out.println("9 minus 4 equals " + subtract(9,4));
        System.out.println("9 minus 3 equals " + subtract(9, 3));

        System.out.println("3 times 3 equals " + multiply(3,3));
        System.out.println("2 times 4 equals " + multiply(2,4));

        System.out.println("8 divided by 2 equals " + divide(8, 2));
        System.out.println("150 divided by 30 equals " + divide(150, 30));
    }
}
