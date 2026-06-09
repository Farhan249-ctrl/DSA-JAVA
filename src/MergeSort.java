public class MergeSort {
    public static void merge(int arr[],int left,int mid,int right){
        int temp[]=new int[right-left+1];
        int i=left,j=mid+1,k=0;

            while(i<=mid && j<=right){
                if(arr[i]<=arr[j]){
                    temp[k]=arr[i];
                    i++;
                }
                else{
                    temp[k]=arr[j];
                    j++;
                }
                k++;
            }
            while(i<=mid){
                temp[k]=arr[i];
                i++;
                k++;
            }
            while(j<=right){
                temp[k]=arr[j];
                j++;
                k++;
            }
        for (int m = 0; m < temp.length; m++) {
            arr[left + m] = temp[m];
        }
    }
    public static void mergeSort(int arr[],int left,int right){
        if(right<=left) return;
       int mid =left+(right-left)/2;
       mergeSort(arr,left,mid);
       mergeSort(arr,mid+1,right);
       merge(arr,left,mid,right);
    }

    public static void main(String[] args) {
        int arr[]={6,4,3,2,1};
        int left=0;
        int right=arr.length-1;
        mergeSort(arr,left,right);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
