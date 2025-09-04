public class Main {
    public static void main(String[] args) {
        int[] arr = {9,8,7,9,9,6,5,1};
        int[] sortedArr = bubbleSort(arr);
        for(int i=0;i< arr.length;i++){
            System.out.print(sortedArr[i] + "\t");
        }
    }

    public static int[] bubbleSort(int[] arr){
        int temp;
        int flag;
        for(int i=0;i<arr.length-1;i++){
            flag=0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                    flag=1;
                }
            }
            if(flag==0){
                break;
            }
        }
        return arr;
    }
}