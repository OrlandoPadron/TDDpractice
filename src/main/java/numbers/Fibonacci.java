package numbers;

public class Fibonacci {
    private String name;
    private int size;
    private String fibo = "";


    public Fibonacci(String name, int size) {
        this.name = name;
        this.size = size;
    }


    public int getFibo(int n) {

        if (n > 1){
            return getFibo(n-1)+getFibo(n-2);
        }
        else if (n==1){
            return 1;
        }
        else if (n==0){
            return 0;
        }else{
            System.out.println("Valor inferior a 1.");
            return -1;
        }
    }

    public String printFibo() {

        for (int i = 0; i < size ; i++) {
            fibo += String.valueOf(getFibo(i)) + " ";
        }
        return fibo.trim();
    }
}
