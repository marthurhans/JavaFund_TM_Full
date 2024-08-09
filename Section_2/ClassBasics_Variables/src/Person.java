import business.Company;

public class Person {
    private final double PI =3.14;
    static private final String MY_BIG_CONSTANT = "Hi this is my constant message!";
    private String firstName = "Jerry";
    private int age;
    private long id;
    private char middleInitial = 'J';
    private  byte myByte;
    static private Company company = new Company();
    static private Company company1 = new Company();
    private NewsAgency agency;

    public void myTestMethod() {
        var age = 21;
        var name = "Jake";
        var intellijDecidedThisForMe = 67.67;
        String mary = "Mary";
        var doug = "Doug";
    }



    public static void main(String[] args) {
        System.out.println();
        System.out.println(company);
        System.out.println(company1);
        System.out.println(MY_BIG_CONSTANT);
    }

}


