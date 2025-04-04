class Hello{
void show(byte... a){//4
System.out.println("4.show(byte...)");
}
}
class Lab616{
public static void main(String as[]){
Hello h=new Hello();
byte b1=10;
byte b2=20;
h.show(b1,b2);
}
}