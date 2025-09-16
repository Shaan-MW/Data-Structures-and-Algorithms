public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int factorials = factorial(5);
        System.out.println(factorials);

    }

    public static int factorial(int number){
        if(number>1){
            return number *  factorial(number-1);
        }

        return number;
    }
}