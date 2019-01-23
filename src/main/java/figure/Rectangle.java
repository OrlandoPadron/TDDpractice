package figure;

public class Rectangle extends Figure {
    private final int base, altura;
    public Rectangle(int base, int altura) {
        this.base = base;
        this.altura=altura;
    }

    @Override
    public int getArea() {
        return base*altura;
    }

    @Override
    public int getPerimeter() {
        return 2*base + 2*altura;
    }
}
