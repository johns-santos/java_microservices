public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

/**
 * This class provides methods for all arithmetic operations on two numbers.
 * @author gosullivan
 *
 */
public class Arithmetic {

    /**
     * Adds two numbers.
     * @param num1 the first number
     * @param num2 the second number
     * @return the sum of num1 and num2
     */
    public static int add(int num1, int num2) {
        System.out.println("Sum: "+(num1+num2));
        return num1 + num2;
    }

    /**
     * Subtracts one number from another.
     * @param num1 the first number
     * @param num2 the second number
     * @return the difference of num1 and num2
     */
    public static int subtract(int num1, int num2) {
        System.out.println("Difference: "+(num1-num2));
        return num1 - num2;
    }

    /**
     * Multiplies two numbers.
     * @param num1 the first number
     * @param num2 the second number
     * @return the product of num1 and num2
     */
    public static int multiply(int num1, int num2) {
        System.out.println("Product: "+(num1*num2));
        return num1 * num2;
    }

    /**
     * Divides one number by another.
     * @param num1 the first number
     * @param num2 the second number
     * @return the quotient of num1 and num2
     */
    public static int divide(int num1, int num2) {
        System.out.println("Quotient: "+(num1/num2));
        return num1 / num2;
    }

    /**
     * Calculates the modulus of two numbers.
     * @param num1 the first number
     * @param num2 the second number
     * @return the modulus of num1 and num2
     */
    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

}
