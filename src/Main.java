public class Main {

    public static void main(String[] args) throws ArithmeticException {
        int num = 10;
        int denom = 0;
        divideNumbers(num, denom);
    }

    public static int divideNumbers(int num, int denom) {
        int result = 0;
        try{
             result = num /denom;
            System.out.println("Te result is: " + result);
        }catch (Exception e){
            System.out.println("Error: number isn't divide fro 0");
        }
        return result;
    }
}
