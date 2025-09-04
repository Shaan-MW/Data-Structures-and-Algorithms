public class Main {
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        printArray(arr);
        int[] sortedArray=insertionSort(arr);
        System.out.println();
        printArray(sortedArray);
    }

    public static int[] insertionSort(int[] arr){
        int temp;int j;
        for(int i=1;i<arr.length;i++){
            temp=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        return arr;
    }

    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + "\t");
        }
    }
}