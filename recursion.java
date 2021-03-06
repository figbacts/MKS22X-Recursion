import java.util.*;
public class recursion{
  public static void main(String[] args){
    //testFib(0);
    //testFib(1);
    //testFib(2);
    //testFib(3);
    //testFib(4);
    //testFib(5);
    //testSqrt(0);
    //testSqrt(1);
    //testSqrt(2);
    //testSqrt(3);
    //testSqrt(4);
  }
  public static boolean closeEnough(double a, double b){
    if(a==0.0 && b==0.0)return true;
    if(a==0.0)return b < 0.00000000001;
    if(b==0.0)return a < 0.00000000001;
    return Math.abs(a-b)/a < 0.0001;//This is the normal % difference allowed

}


//testcase must be a valid index of your input/output array
public static void testFib(int testcase){
  recursion r = new recursion();
  int[] input = {0,1,2,3,5,30};
  int[] output ={0,1,1,2,5,832040};
  int max = input.length;
  if(testcase < input.length){
    int in = input[testcase];
    try{

      int ans = r.fib(in);
      int correct = output[testcase];
      if(ans == correct){
        System.out.println("PASS test fib "+in+". "+correct);
      }
      else{
        System.out.println("FAIL test fib"+in+". "+ans+" vs "+correct);

      }
    }catch(IllegalArgumentException n){
      if(in < 0){
        System.out.println("PASS test fib"+in+" IllegalArgumentException");
      }else{
        System.out.println(" FAIL IllegalArgumentException in test case:"+in);
      }
    }catch(Exception e){
      System.out.println(" FAIL Some exception in test case:"+in);
    }
  }
}


//testcase must be a valid index of your input/output array
public static void testSqrt(int testcase){
  recursion r = new recursion();
  double[] input = {0.0,1.0, 2.0, 4.0, 7.0};
  double[] output = {0.0,1.0,1.4142135623730951,2.0,2.6457513110645907};
  int max = input.length;
  if(testcase < input.length){
    double in = input[testcase];
    try{
      double ans = r.sqrt(in,0.00001);
      double correct = Math.sqrt(in);
      if(closeEnough(ans,correct)){
        System.out.println("PASS test sqrt "+in+" "+ans);
      }
      else{
        System.out.println("FAIL test sqrt "+in+" "+ans+" vs "+correct);

      }
    }catch(IllegalArgumentException n){
      if(in < 0){
        System.out.println("PASS test sqrt"+in+" IllegalArgumentException");
      }else{
        System.out.println(" FAIL IllegalArgumentException in test case:"+in);
      }
    }catch(Exception e){
      System.out.println(" FAIL Some exception in test case:"+in);
    }
  }
}
  public static double sqrt(double n, double tolerance){
    if (n * 1.00001 < tolerance * tolerance || n * 0.99999 > tolerance * tolerance){
      return sqrt(n,(n/tolerance + tolerance)/2 );
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
