public class AccessModifiers {
    public int pubValue = 10;
    private int privValue = 20;
    protected int protValue = 30;
    int defValue = 40; // default access

    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    void defaultMethod() {
        System.out.println("This is a default-access method.");
    }

    public int getPrivValue() {
        return privValue;
    }

    public void callPrivateMethod() {
        privateMethod();
    }

    public static void main(String[] args) {
        TestAccess.main(args); // call test from below class
    }
}

class TestAccess {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();

        System.out.println("Public Var: " + obj.pubValue);
        System.out.println("Private Var (via getter): " + obj.getPrivValue());
        System.out.println("Protected Var: " + obj.protValue);
        System.out.println("Default Var: " + obj.defValue);

        obj.publicMethod();
        obj.callPrivateMethod();
        obj.protectedMethod();
        obj.defaultMethod();
    }
}