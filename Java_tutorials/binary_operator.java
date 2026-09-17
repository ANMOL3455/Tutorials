/*binary_operator uses two operands and that are also divided into following parts
1. arthmatic operator [+,-,*,/,%]
2. Comparision operator [<,>,<=,>=,==,!=]
3. Logical operator [&&, ||, !]
4. Bitwise operator [&,|,^,>>,>>>,<<<,<<]
5. Assignment operator [=,+=,-=,*=]
*/

//program to demonstrate arthmetic operator
public class binary_operator{
public static void main(String... args){
int a = 21;
int b= 23;
System.out.println("sum = " +(a+b));
System.out.println("difference = " +(a-b));
System.out.println("product = " +(a*b));
System.out.println("division = " +(a/(double)b));
System.out.println("reminder = " +(a%b));


//program to demonstrate comparision operator
int m=78;
int n= 34;
System.out.println(m>n);
System.out.println(m<n);
System.out.println(m!=n);
System.out.println(m==n);
System.out.println(m<=n);
System.out.println(m>=n);

//program to demonstrate bitwise operator
int p=78;
int u= 34;
System.out.println("bit wise for 78 and 34 is: "+(p&u));
System.out.println("bit wise for 78 xor 34 is: "+(p^u));
System.out.println("bit wise for 78 or 34 is: "+(p|u));
System.out.println("bit wise for 78 >> 34 is: "+(p>>u));
System.out.println("bit wise for 78 << 34 is: "+(p<<u));
System.out.println("bit wise for 78 >>> 34 is: "+(p>>>u));
System.out.println(52>>2)
System.out.println(52>>2)
}		
}
