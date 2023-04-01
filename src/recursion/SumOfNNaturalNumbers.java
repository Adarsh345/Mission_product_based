package recursion;

public class SumOfNNaturalNumbers {
    public static int sumOfNNaturalNumbers(int n ){
        if(n == 0 )
            return 0;


       return sumOfNNaturalNumbers(n -1) + n;
    }

    public static void main(String[] args) {
        System.out.println(sumOfNNaturalNumbers(10));
    }
}
