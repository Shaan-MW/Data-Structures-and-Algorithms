public class Main {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,-2,1};
        int[] sortedArray = SelectionSort(arr);
        printArray(sortedArray);
    }

    public static int[] SelectionSort(int[] arr){
        int min,temp;
        for(int i=0;i<arr.length-1;i++){
            min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min] > arr[j])
                    min = j;
            }
            if(min != i){
                temp = arr[min];
                arr[min] = arr[i];
                arr[i]= temp;
            }
        }

        return arr;
    }

    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + "\t");
        }
    }
}

