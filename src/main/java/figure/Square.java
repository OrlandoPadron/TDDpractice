package figure;

public class Square extends Figure {
    private int lado;
    public Square(int lado) {
        this.lado = lado;
    }

    @Override
    public int getArea() {
        return lado*lado;
    }

    @Override
    public int getPerimeter() {
        return lado*4;
    }
}
