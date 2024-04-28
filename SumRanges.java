public class SumRanges {
    public static long subArrayRanges(int[] nums) {
        long sum = 0;
        for(int i=0; i<nums.length-1; i++){
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int j=i; j<nums.length; j++){
                if(nums[j] > max){
                    max = nums[j];
                }
                if(nums[j] < min){
                    min = nums[j];
                }
                sum += max-min;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {4,-2,-3,4,1};
        System.out.println(subArrayRanges(nums));
    }
}
