package OOP.Interface.Beispiel;

public class Square extends Form implements VolumenInterface {
    private int width;

    public Square(String color, int width) {
        super(color);
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int berechneFläche() {
        return width * width;
    }

    @Override
    public int berechneVolumen() {
        return width * width * 10 / 100;
    }
}
