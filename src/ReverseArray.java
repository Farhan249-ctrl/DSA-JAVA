public class ReverseArray {
    public static void reverseArray(int arr[]) {
        int first = 0;
        int last = arr.length - 1;
        for (int i = 0; i < (last + 1) / 2; i++) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr [last] = temp;

            first++;
            last--;
        }

    }

    public static void main(String[] args) {
        int val[]={1,2,3,4,5,6};
        reverseArray(val);
        for(int i=0;i<=val.length-1;i++){
            System.out.print(val[i]+" ");
        }

    }
}
