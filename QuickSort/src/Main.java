public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        int[] arr = {7,6,10,5,9,2,1,15,7};
        getPrintArr(arr);
        int[] sortedArr = getQuickSort(arr,0,arr.length-1);
        getPrintArr(sortedArr);
    }

    public static void getPrintArr(int[] arr){
        for (int j : arr) {
            System.out.print(j + "\t ");
        }
        System.out.println();
    }

    public static int getPartition(int[] arr, int lowerBound, int upperBound){
        int pivot = arr[lowerBound];
        int start = lowerBound;
        int end = upperBound;
        int swap;

        while(start<end){
            while(start <= upperBound && arr[start] <= pivot){
                start++;
            }
            while(end >= lowerBound && arr[end] > pivot){
                end--;
            }
            if(start<end){
                swap = arr[start];
                arr[start] = arr[end];
                arr[end] = swap;
            }
        }
        swap = arr[lowerBound];
        arr[lowerBound] = arr[end];
        arr[end] = swap;
        return end;
    }

    public static int[] getQuickSort(int[] arr, int lowerBound, int upperBound){
        if(lowerBound<upperBound){
            int loc = getPartition(arr,lowerBound,upperBound);
            getQuickSort(arr,lowerBound,loc-1);
            getQuickSort(arr,loc+1,upperBound);
        }

        return arr;
    }
    }