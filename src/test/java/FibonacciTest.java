import numbers.Fibonacci;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FibonacciTest {

    private Fibonacci fibo;


    @Test
    public void given_a_fibonacci_with_size_1_getFibo_should_return_0(){
        fibo = new Fibonacci("Fibonacci 1", 1);
        assertThat(fibo.printFibo()).isEqualTo("0");
    }

    @Test
    public void given_a_fibonacci_with_size_2_getFibo_should_return_01(){
        fibo = new Fibonacci("Fibonacci 1", 2);
        assertThat(fibo.printFibo()).isEqualTo("0 1");
    }

    @Test
    public void given_a_fibonacci_with_size_3_getFibo_should_return_011(){
        fibo = new Fibonacci("Fibonacci 1", 3);
        assertThat(fibo.printFibo()).isEqualTo("0 1 1");
    }

    @Test
    public void given_a_fibonacci_with_size_10_getFibo_should_return_0112358132134(){
        fibo = new Fibonacci("Fibonacci 1", 10);
        assertThat(fibo.printFibo()).isEqualTo("0 1 1 2 3 5 8 13 21 34");
    }


}
