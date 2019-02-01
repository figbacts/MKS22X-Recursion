public class recursion{
  public static void main(String[] args){
    System.out.println("Testing sqrt: sqrt(100) " + sqrt(100));
    System.out.println("Testing sqrt: sqrt(25) " + sqrt(25));
    System.out.println("Testing sqrt: sqrt(2) " + sqrt(2));
    System.out.println("Testing fib: fib(0) " + fib(0));
    System.out.println("Testing fib: fib(5) " + fib(5));
    System.out.println("Testing fib: fib(7) " + fib(7));

  }
  public static double sqrt(double n){
    return sqrtH(n,1);
  }
  private static double sqrtH(double n, double guess){
    if (n * 1.00001 < guess * guess || n * 0.99999 > guess * guess){
      return sqrtH(n,(n/guess + guess)/2 );
    }
    else{
      return guess;
    }
  }

  public static int fib(int n){
    return fibH(n, 0, 1);
  }
  private static int fibH(int n, int prevprev, int prev){
    if (n == 0){
      return 0;
    }
    if (n == 1){
      return prev;
    }
    else{
      return fibH(n - 1, prev, prevprev + prev);
    }
  }

}
