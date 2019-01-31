public class recursion{
  public static void main(String[] args){
    System.out.println("Testing sqrt" + sqrt(100));
    System.out.println(sqrt(25));
    System.out.println(sqrt(2));
  }
  public static double sqrt(double n){
    return sqrtH(n,1);
  }
  public static double sqrtH(double n, double guess){
    if (n * 1.00001 < guess * guess || n * 0.99999 > guess * guess){
      return sqrtH(n,(n/guess + guess)/2 );
    }
    else{
      return guess;
    }
  }
}
