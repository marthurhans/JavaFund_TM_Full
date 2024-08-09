package package2;

public class ClassB {

    public void publicMethod() {
        System.out.println("This is the public method of Class B");
        privateMethod();
    }

    private void privateMethod() {
        System.out.println("This is the private method of Class B");
    }

    protected void protectedMethod() {
        System.out.println("This is the protected method of ClassB");
    }

    void packageProtected() {
        System.out.println("This is the package protected method of ClassB");
    }

}
