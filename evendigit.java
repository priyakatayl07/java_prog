// given an array nums of integer return how many of them contain an even number of digits
public class evendigit{
    public static void main(String[] args) {
        int[] nums={12,345,67,890,123456,89,90};
        int result=findnumber(nums);
        System.out.println("count of numbers with even number of digits:"+result);
    }
    static int findnumber(int[]nums){
        int count =0;
        for(int i =0;i<nums.length;i++){
            int num=nums[i];
            if(num<=0){
                num=-num;
            }
            int digitcount=0;
            while(num>0){
                num=num/10;
                digitcount++;
            }
            if(digitcount%2==0){
                count++;
            }
        }
        return count; 


    }
}