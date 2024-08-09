public class ArrayDemo {

    public static void main(String[] args) {
        System.out.println(args.length);
        if(args.length != 0) {
            System.out.println(args[3]);
        } //I added the conditional!

        int[] nums = {10, 20, 30, 40, 50};
        System.out.println(nums.length);
        System.out.println(nums[1]);
    }


}
