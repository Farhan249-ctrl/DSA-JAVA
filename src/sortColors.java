public class sortColors {
    public static void sortColors(int nums[]){
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
            } else if (nums[mid]==1) {
                mid++;

            }
            else{
                int temp2=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp2;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int nums[]={2,2,1,0,2,1};
        sortColors(nums);
        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
