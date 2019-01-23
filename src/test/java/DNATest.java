import dna.DNA;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DNATest {

    private DNA dna = new DNA();

    @Test
    public void given_a_non_valid_dna_chain_makeComplement_should_return_an_empty_string(){
        assertThat(dna.makeComplement("nonvAliddna")).isEqualTo("");

    }
    @Test
    public void given_a_A_should_return_a_T_and_vice_versa(){
        assertThat(dna.makeComplement("A")).isEqualTo("T");
        assertThat(dna.makeComplement("T")).isEqualTo("A");
    }

    @Test
    public void given_a_G_makeComplement_should_return_a_C_and_vice_versa(){
        assertThat(dna.makeComplement("G")).isEqualTo("C");
        assertThat(dna.makeComplement("C")).isEqualTo("G");
    }

    @Test
    public void given_a_chain_of_As_makeComplement_should_return_a_chain_of_T_and_vice_versa(){
        assertThat(dna.makeComplement("AAA")).isEqualTo("TTT");
        assertThat(dna.makeComplement("TTT")).isEqualTo("AAA");


    }

    @Test
    public void given_a_chain_of_dna_makeComplement_should_return_a_valid_dna_complement(){
        assertThat(dna.makeComplement("ATATCG")).isEqualTo("TATAGC");
        assertThat(dna.makeComplement("GCGCATT")).isEqualTo("CGCGTAA");

    }

}
