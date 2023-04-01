package recursion;

public class FindThePowerOfNNaturalNumber {
    public static int findThePowerOfNNaturalNumber(int n , int p){
        if(p == 0 )
            return 1 ;
      return   n*findThePowerOfNNaturalNumber(n , p-1);

    }

    public static void main(String[] args) {
        System.out.println(findThePowerOfNNaturalNumber(3,3));
    }
}
