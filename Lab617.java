class Lab617{
public static void main(String as[]){
System.out.println("I am regular Message");
System.exit(0);
System.err.println("I am Error Message");
System.err.println(System.currentTimeMillis())
;
System.err.println(System.nanoTime());
 System.gc();
 System.runFinalization();
}
}