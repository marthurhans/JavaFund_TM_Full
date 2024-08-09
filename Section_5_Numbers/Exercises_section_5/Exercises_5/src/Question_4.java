public class Question_4 {

    private int[] waitTimes = {13, 49, 90, 130, 175, 181, 255, 310, 330, 5555};
    private int count = 0;

    public int next() {
        int items = waitTimes[count++];
        if (items > 0 && items < 90) {
            return 0;
        } else if (items >= 90 && items < 180) {
            return 1;
        } else if (items >= 180 && items < 270) {
            return 2;
        } else if (items >= 270 && items <= 364) {
            return 3;
        }
        return -1;
    }


    public static void main(String[] args) {
        Question_4 q4 = new Question_4();
        System.out.println(q4.next());
        System.out.println(q4.next());
        System.out.println(q4.next());
        System.out.println(q4.next());
        System.out.println(q4.next());
        System.out.println(q4.next());
        System.out.println(q4.next());
        System.out.println(q4.next());
        System.out.println(q4.next());
        System.out.println(q4.next());

    }


}
