import java.math.BigDecimal;
public class Lab626 {
public static void main(String[] args) {
double d1 = Double.MAX_VALUE;
double res = d1 + 100;
System.out.println(d1);
System.out.println(res);
System.out.println("\n***");
BigDecimal dec1 = new
BigDecimal(Double.MAX_VALUE);
System.out.println(dec1);
BigDecimal dec2 = new BigDecimal(100);
BigDecimal res2 = dec1.add(dec2);
System.out.println(res2);
BigDecimal dec1=new
BigDecimal(Double.POSITIVE_INFINITY);
System.out.println(dec1);
}
}
