package figure;

public class Triangle extends Figure {
    private final int sideB, altura, sideA,sideC;

    public Triangle(int sideA, int base, int sideC, int altura) {
        this.sideB = base;
        this.altura=altura;
        this.sideA = sideA;
        this.sideC = sideC;
    }

    @Override
    public int getArea(){
        return (sideB *altura)/2;
    }

    @Override
    public int getPerimeter() {
        return sideA+sideB+sideC;
    }
}
