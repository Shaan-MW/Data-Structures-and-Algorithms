public class Main {
    static int[] arr = {9,8,7,6,5,4,3,2,1};
    public static void main(String[] args) {
        System.out.println("Hello world!");
        printArray(arr);
        //int[] sortedArr;
        mergeSort(arr, 0,arr.length-1);
        printArray(arr);

    }

    public  static void mergeSort(int[] arr, int lowerBound, int upperBound){
        int middleElementIndex;
        if(lowerBound<upperBound){
            middleElementIndex = (lowerBound+upperBound)/2;
            mergeSort(arr,lowerBound,middleElementIndex);
            mergeSort(arr,middleElementIndex+1,upperBound);
            mergeElement(arr, lowerBound, middleElementIndex, upperBound,sortedArray);
        }
    }

    static int[] sortedArray = new int[arr.length];
    public static void mergeElement(int[] arr, int lowerBound,int middleElementIndex, int upperBound, int[] sortedArray){
        int i = lowerBound;
        int j = middleElementIndex+1;
        int k =lowerBound;
        
        while (i<=middleElementIndex && j<=upperBound){
            if(arr[i]<=arr[j]){
                sortedArray[k] = arr[i];
                i++;
            }else
            {
                sortedArray[k] = arr[j];
                j++;
            }
            k++;
        }
        
        if(i>middleElementIndex){
            while(j<=upperBound){
                sortedArray[k] = arr[j];
                j++;k++;
            }
        }else{
            while (i<=middleElementIndex){
                sortedArray[k] = arr[i];
                i++;k++;
            }
        }

        for (int index = lowerBound; index <= upperBound; index++) {
            arr[index] = sortedArray[index];
        }
    }

    public static void printArray(int[] arr){
        for(int j:arr){
            System.out.print(j + "\t");
        }
        System.out.println();
    }
}

