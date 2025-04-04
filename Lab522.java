class Hello{
void show(int a,int b){//1
System.out.println("1.show(int,int)");
}
void show(byte a,byte b){//2
System.out.println("2.show(byte,byte)");
}
void show(Byte a,Byte b){//3
System.out.println("3.show(Byte,Byte)");
}
void show(byte... a){//4
System.out.println("4.show(byte...)");
}
}
class Lab522{
public static void main(String as[]){
Hello h=new Hello();
byte b1=10;
byte b2=20;
h.show();
h.show(b1);
h.show(b1,b2);
}
}