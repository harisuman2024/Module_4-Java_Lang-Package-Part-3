class Lab621{
public static void main(String as[]) throws
Exception{
if(as.length==1){
Runtime rt=Runtime.getRuntime();
String app=as[0]+".exe";
Process p=rt.exec(app);
}else{
System.out.println("Specify the App name");
}