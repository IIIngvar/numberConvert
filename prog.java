import java.util.*;
import java.lang.*;
import java.io.*;

class prog{
  public static void main(String args[]){
    Reader r = new Reader();
    r.Scan();
    
    first: {                     // proverka na pravilnost vvoda znachenia a
    if ( r.a <2 || r.a > 36)  {
        System.out.println("Incorrect data (a)");
        break first;
        }
    }
    
    second:{                     // proverka na pravilnost vvoda znachenia b
    if ( r.b <2 || r.a > 36)  {
        System.out.println("Incorrect data (b)");
        break second;
        }
    }
    int y = Integer.parseInt(r.x , r.a) ;  // perevod x iz nachalnoy sistemy schislenia v int(10)
    String result = Integer.toString(y, r.b);
    System.out.println("Result =  " + result );
 }
}

class Reader{   // vvod dannyh v otdelniy class 
  int a;
  String x;
  int b;
  public void Scan() {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter a");
    a = scn.nextInt();
    System.out.println("Enter x");
    x = scn.next();
    System.out.println("Enter b");
    b = scn.nextInt();
  }
}