public class Main {
    public static void main(String[] args) {
        int[] array = {23,12,43,6,8,76,54,32,1};
        int searchNumber = 12;
        searchElement(array, searchNumber);
    }

    public static void searchElement(int[] arr, int number){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==number){
                System.out.println("Element Found in index : "+i);
                break;
            }
        }
    }
}