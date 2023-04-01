package recursion;

public class PrintNNaturalNumber {
    public static void printNNaturalNumber(int n){
        if(n == 0 ){
            return;
        }
        printNNaturalNumber(n-1);
        System.out.println(n);


    }
    public static void main(String[] args) {
        printNNaturalNumber(10);

    }
}
