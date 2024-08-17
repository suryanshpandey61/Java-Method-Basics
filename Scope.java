class Scope
{

  
  int b = 10000;

  // int a = 250; 
 public static void main (String[] args)
  {
    int a = 20;
   System.out.println("Inside Main method value of a is :"+a);
    
   Scope sc = new Scope();
   sc.demo();

  /* 
  call the method of another clASS
   Program1.demo();
  */


   /* for static access varible we acces the variable by clas refrence
   System.out.println("Outside the main method value of a is :"+Scope.a); */


    /* Scope s1 = new Scope();
   System.out.println("non static value of a is : "+s1.a); */

   
  }

 public void demo ()
 {
   System.out.println("Inside demo method");
   System.out.println("Value of non-static varible calling in non static method b is :"+this.b);
 }
 


}