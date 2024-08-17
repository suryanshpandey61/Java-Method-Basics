class Program2
{
 
 public static int getSum (int x,int y)
 {
  int sum = x+y;
  return sum;
 }



 public static void main (String[] args)
 {
  System.out.println("Main method start");
  int p= 10;
  int q=20;
  int r = getSum(p,q);
  System.out.println(+r+" square is :" +r*r);
  
 }
}