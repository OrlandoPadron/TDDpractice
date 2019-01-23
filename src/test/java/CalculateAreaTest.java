import figure.*;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CalculateAreaTest {
    private Figure cuadrado, rectangulo, triangulo, rombo;

    @Before
    public void setUp(){
        cuadrado = new Square(5);
        rectangulo = new Rectangle(5, 4);
        triangulo = new Triangle(5, 10, 5,5);
        rombo = new Rhombus(10, 5, 10);
    }

    @Test
    public void give_a_non_specific_figure_getArea_should_return_0(){
        assertThat(new Figure().getArea()).isZero();

    }
    @Test
    public void given_a_non_specific_figure_getPermiter_should_return_0(){
        assertThat(new Figure().getPerimeter()).isZero();
    }
    @Test
    public void given_a_valid_square_getArea_return_its_area(){
        assertThat(cuadrado.getArea()).isEqualTo(25);
    }

    @Test
    public void given_a_valid_square_getPermiter_should_return_its_perimeter(){
        assertThat(cuadrado.getPerimeter()).isEqualTo(20);
    }

    @Test
    public void given_a_valid_rectangle_getArea_should_return_its_area(){
        assertThat(rectangulo.getArea()).isEqualTo(20);
    }

    @Test
    public void given_a_valid_rectangl_getPerimeter_should_return_its_perimeter(){
        assertThat(rectangulo.getPerimeter()).isEqualTo(18);
    }

    @Test
    public void given_a_valid_triangle_getArea_should_return_its_area(){
        assertThat(triangulo.getArea()).isEqualTo(25);
    }

    @Test
    public void given_a_valid_triangle_getPerimeter_should_return_its_perimeter(){
        assertThat(triangulo.getPerimeter()).isEqualTo(20);
    }

    @Test
    public void given_a_valid_rhombus_getArea_should_return_rombus_area(){
        assertThat(rombo.getArea()).isEqualTo(25);
    }

    @Test
    public void given_a_valid_rhombus_getPerimeter_should_return_rombus_perimeter(){
        assertThat(rombo.getPerimeter()).isEqualTo(40);
    }


}
