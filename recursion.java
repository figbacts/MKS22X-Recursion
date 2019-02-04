import java.util.*;
public class recursion{
  public static void main(String[] args){
    System.out.println("Testing sqrt: sqrt(100) " + sqrt(100));
    System.out.println("Testing sqrt: sqrt(25) " + sqrt(25));
    System.out.println("Testing sqrt: sqrt(2) " + sqrt(2));
    System.out.println("Testing fib: fib(0) " + fib(0));
    System.out.println("Testing fib: fib(5) " + fib(5));
    System.out.println("Testing fib: fib(7) " + fib(7));
    System.out.println("Testing makeAllSums: makeAllSums(3) " + makeAllSums(3));

  }
  public static double sqrtH(double n, double tolerance){
    if (n * 1.00001 < tolerance * tolerance || n * 0.99999 > tolerance * tolerance){
      return sqrtH(n,(n/tolerance + tolerance)/2 );
    }
    else{
      return tolerance;
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

  public static ArrayList<Integer> makeAllSums(int n){
      ArrayList<Integer> aryans = new ArrayList<Integer>();
      makeAllSumsH(aryans, n, 0);
      return aryans;
    }

  private static void makeAllSumsH(ArrayList<Integer> aryans, int n, int ans){
    System.out.println("(" + n + "," + ans + ")");
    if (n == 0){
      aryans.add(ans);
    }
    else{
    makeAllSumsH(aryans, n - 1, ans += n);
    makeAllSumsH(aryans, n - 1, ans -= n);
  }
}

}
