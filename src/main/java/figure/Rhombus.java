package figure;

public class Rhombus extends Figure {
    private final int Dmayor, dmenor,lado;
    public Rhombus(int D, int d, int lado) {
        this.lado = lado;
        this.Dmayor = D;
        this.dmenor = d;
    }

    @Override
    public int getArea() {
        return (Dmayor*dmenor)/2;
    }

    @Override
    public int getPerimeter() {
        return lado*4;
    }
}
