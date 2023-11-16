public class Main {

    public static void main(String[] args) throws ArithmeticException {
        int num = 10;
        int denom = 0;
        divideNumbers(num, denom);
    }

    public static void divideNumbers(int num, int denom) {
        if (denom == 0) {
            throw new ArithmeticException("Error: number isn't divide fro 0");
        }

        int result = num / denom;
        System.out.println("Te result is: " + result);
    }
}
