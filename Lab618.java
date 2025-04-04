import java.io.*;
class Lab618{
public static void main(String as[]){
PrintStream ps= System.out;
ps.println("I am regular Message");
ps.println("I am Error Message");
ps.println(System.currentTimeMillis());
ps.println(System.nanoTime());
 System.gc();
 System.runFinalization();
}
} 