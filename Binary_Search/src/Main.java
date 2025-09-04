public class Main {
    public static void main(String[] args) {
        int[] arr = {5,9,11,27,39,47,51,61,72,99};
        int target = 99;
        int result=binarySearch(arr,target);
        if(result != -1)
            System.out.println("Element is found in index : "+ result);
        else
            System.out.println("Element not found");
    }

    public static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while(left<=right){
            int middle = (left+right)/2;
            if(arr[middle] == target)
                return middle;
            else if(arr[middle]<target){
                left = middle+1;
            }else{
                right = middle-1;
            }
        }

        return -1;
    }
}