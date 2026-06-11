public class QuickSort {
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(pivot>arr[j]){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[high];
        arr[high]=arr[i+1];
        arr[i+1]=temp;

        return i+1;}
    public static void quickSort(int arr[],int low ,int high){
        if(low>=high) return;
        int pivotIndex=partition(arr,low,high);
        quickSort(arr,low,pivotIndex-1);
        quickSort(arr,pivotIndex+1,high);
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 4};
        quickSort(arr,0, arr.length-1);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

