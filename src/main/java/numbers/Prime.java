package numbers;

public class Prime {
    public boolean isPrime(int num) {
        if (num <= 1) return false;
        int count =0;
        for (int i = 1; i <= num ; i++) {
            if (num%i==0) count++;
            if (count > 2) return false;
        }
        return true;
    }
}
