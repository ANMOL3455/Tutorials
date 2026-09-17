public class increments{
public static void main(String... args){
int a = 10;
//this is pre increment
int b = ++a;
System.out.println("value of a " +a);
System.out.println("value of b with pre increment " +b);

//this is post increment
int x = a++;
System.out.println("value of a " +a);
System.out.println("value of x with post increment " +x);

//this is for decrecement
//this is pre increment
int p= 10;
int g = --p;
System.out.println("value of a " +p);
System.out.println("value of b with pre increment " +g);

//this is post increment
int h = p--;
System.out.println("value of a " +p);
System.out.println("value of x with post increment " +h);

}
}