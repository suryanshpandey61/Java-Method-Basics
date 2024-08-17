class Arithmatic 
{

 public static void getAddition(int x , int y)
 {
  int sum = x+y;
  System.out.println("Sum of "+x+ " and " +y+ " is :" +sum);
 }

 public static void getMultiplication(int a, int b)
 {
  int mul=a*b;
  System.out.println("Multiplication of "+a+ " and " +b+ " is :"+mul);
 }


 public static void main (String[] args)
 {
  System.out.println("Main method start");
  getAddition(10,40);
  getMultiplication(20,50);

 }

}