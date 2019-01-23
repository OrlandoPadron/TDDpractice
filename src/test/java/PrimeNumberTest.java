import numbers.Prime;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PrimeNumberTest {
    Prime num = new Prime();

    @Test
    public void given_a_prime_number_isPrime_should_return_true(){
        assertThat(num.isPrime(5)).isTrue();
        assertThat(num.isPrime(4)).isFalse();
        assertThat(num.isPrime(17)).isTrue();
        assertThat(num.isPrime(24)).isFalse();
        assertThat(num.isPrime(18)).isFalse();
        assertThat(num.isPrime(31)).isTrue();
        assertThat(num.isPrime(1)).isFalse();
    }


}
