public class Car {
    private String name;
    public String hersteller;
    int ps;
    protected int baujahr;

    public Car() {

    }

    public Car(String name, int baujahr) {
        this.name = name;
        this.baujahr = baujahr;
    }

    private void drive() {

    }

    protected void stop() {

    }

    public int printSpeed() {
        return 100;
    }

    protected boolean test(float a) {
        return true;
    }
}
