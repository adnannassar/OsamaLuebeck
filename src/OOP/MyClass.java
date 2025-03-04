package OOP;

public class MyClass {
    public int x = 10;

    // no modifier means package-private
    // default access modifier
    public void print() {
        System.out.println(x);
        x = 30;
    }
}
