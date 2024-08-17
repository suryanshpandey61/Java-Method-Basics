class Sqaure 
{
 public static void test(int x)
 {
   int sq = x*x;
   System.out.println("Square of "+x+ " is :" +sq);
 }
  
 public static void main(String[] args)
 {
  System.out.println("Main method start");
   int a=7;
  test(a);
  System.out.println("Main method ends");
 }

}