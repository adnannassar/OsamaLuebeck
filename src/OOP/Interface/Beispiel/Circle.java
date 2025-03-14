package OOP.Interface.Beispiel;

public class Circle extends Form {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public int berechneFläche() {
        return (int) (2 * Math.PI * radius * radius);
    }
}
