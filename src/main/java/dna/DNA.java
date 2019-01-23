package dna;

public class DNA {

    public DNA() {
    }

    public String makeComplement(String dna){
        String res = "";
        for (int i = 0; i < dna.toCharArray().length ; i++) {
            if (String.valueOf(dna.toCharArray()[i]).equals("A")) res += "T";
            if (String.valueOf(dna.toCharArray()[i]).equals("T")) res += "A";
            if (String.valueOf(dna.toCharArray()[i]).equals("C")) res += "G";
            if (String.valueOf(dna.toCharArray()[i]).equals("G")) res += "C";
        }
        if (dna.length()!=res.length()) return "";
        return res;
    }
}
