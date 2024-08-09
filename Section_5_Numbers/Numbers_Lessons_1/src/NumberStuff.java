public class NumberStuff {
    public static void main(String[] args) {
        byte myByte = 127;
        boolean myFlag = true;
        short myBigShort = 32767;
        char myChar = '蹽';
        char myA ='A';
        char biggerShort = 36477;
        System.out.println(myByte);
        double myDouble = 3.141592;
        float myFloat = 3.141592F;

        double num1 = 2.15;
        double num2 = 1.10;
        System.out.println("Double: " + (num1 - num2));

        float num3 = 2.15f;
        float num4 = 1.10f;
        System.out.println("Float: " + (num3 - num4));

        byte anotherByte = 0x1f;
        int anotherInt = 0b01010101;
        int intWithOrPipe = 0b01 | 0b10 | 0b100; // binary=1 | binary=2 | binary=4

        System.out.println(anotherInt);
        System.out.println(intWithOrPipe);
        System.out.println();

    }
}
