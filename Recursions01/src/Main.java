public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        numbersPrint(9);
    }

    public static void numbersPrint(int numbers){
        if(numbers==0)
            return;
        //System.out.println(numbers);
        numbersPrint(numbers-1);
        System.out.println(numbers);
    }
}