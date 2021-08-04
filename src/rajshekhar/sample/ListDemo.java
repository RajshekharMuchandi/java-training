package rajshekhar.sample;

public class ListDemo extends Object{

    public static void main(String[] args) {
        System.out.println(firstLast6(new int[]{ 1,2,3,4,5,6,7,8,9,10}));
        System.out.println(firstLast6(new int[]{ 6,2,3,4,5,6,7,8,9,10}));
        System.out.println(firstLast6(new int[]{ 1,2,3,4,5,6,7,8,9,6}));
        System.out.println(firstLast6(new int[]{ 1,2,3,4,5,7,8,9,10}));
    }

    public static boolean firstLast6(int[] nums) {
        if(nums[0] == 6 || nums[nums.length-1] == 6){
            return true;
        }
        return false;
    }


}
