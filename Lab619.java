import java.io.*;
import java.util.*;
class Lab619{
public static void main(String as[]){
Properties props=System.getProperties();
System.out.println(props);
System.out.println("-------------------");
System.setProperty("my.web.site","myjlc123.co
m");
System.setProperty("trainer.name","Srinivas
Dande");
Enumeration enms=props.propertyNames();
while(enms.hasMoreElements()){
System.out.println(enms.nextElement());
}
System.out.println("-------------------");
System.out.println(System.getProperty("java.io.tmp
dir"));
System.out.println(System.getProperty("java.vm.ve
ndor"));
System.out.println(System.getProperty("java.librar
y.path"));
System.out.println(System.getProperty("trainer.na
me")); 