public class Question_3 {

    public static String[] names = {"bob", "joe", "kat", "lou", "jim", "luc", "kid",
     "wic", "nic", "sam"};

    public static int count = 0;

    public static void main(String[] args) {
        next(names, count);
        next(names, count);
        next(names, count);
        next(names, count);
        next(names, count);
        next(names, count);
        next(names, count);
        next(names, count);
        next(names, count);
        next(names, count);
        next(names, count);
        next(names, count);
        next(names, count);


    }

    public static void next(String[] names, int count) {
        if(count < names.length) {
            System.out.println(names[count].substring(0, 1).toUpperCase() +
                    names[count].substring(1));
        } else {
                System.out.println("No more names");
            }
        Question_3.count++;
    }
}
