public class Main {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,0,4,3,2,1,-10};
        System.out.println("Minimum Element : "+ arr[findMinimum(arr)]);
    }

    public static int findMinimum(int[] arr){
        int minimumElementIndex =0;
        for(int i=1;i<arr.length;i++){
            if(arr[minimumElementIndex]>arr[i]){
                minimumElementIndex=i;
            }
        }

        return minimumElementIndex;
    }
}