class Hello{
void show(Byte a,Byte b){//3
System.out.println("3.show(Byte,Byte)");
}
void show(byte... a){//4
System.out.println("4.show(byte...)");
}
}
class Lab615{
public static void main(String as[]){
Hello h=new Hello();
byte b1=10;
byte b2=20;
h.show(b1,b2);
}
}