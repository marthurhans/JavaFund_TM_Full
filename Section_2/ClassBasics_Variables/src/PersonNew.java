public class PersonNew {
    private String firstName;
    private String middleName = "Christopher";
    private String lastName;
    public static final double PI = 3.14;
    public static int[] nums = initNums();

    static {
        nums = new int[5];
        nums[0] = 3;
        nums[1] = 3;
        nums[2] = 3;
        nums[3] = 3;
        nums[4] = 3;
    }

    public static int[] initNums() {
        int[] nums = new int[5];
        nums[0] = 3;
        nums[1] = 3;
        nums[2] = 3;
        nums[3] = 3;
        nums[4] = 3;
        return nums;
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public void saySomething(String message) {
        System.out.println(message);
    }

    public char getMiddleInitial() {
        return middleName.charAt(0);
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public void test(int num1, int num2, String[] words) {
        // do something clever with words
    }

    public void test2(int num1, int num2, String... words) {
        // do something clever with words
    }


    public static void main(String[] args) {
        PersonNew p1 = new PersonNew();
        p1.sayHello();
        p1.saySomething("My sweet ass message");
        p1.saySomething("Something else to say");
        System.out.println(p1.getMiddleInitial());
        System.out.println(p1.add(5, 3));
        String[] words = new String[] {"one", "two", "three"};
        p1.test(1,2, words);
        p1.test2(2,2,"one", "two", "three");
        System.out.println(PI);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static int[] getNums() {
        return nums;
    }

    public static void setNums(int[] nums) {
        PersonNew.nums = nums;
    }
}
