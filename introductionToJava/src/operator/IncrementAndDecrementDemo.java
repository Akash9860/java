package operator;

public class IncrementAndDecrementDemo {
	 public static void main(String[] args) {
		 int x = 61 , y = 4;
				 ++x ;
		 int z = x + y++;
		 System.out.println(x);
		 System.out.println(y);
		 System.out.println(z);
		 
		 int d = 61 , e = 4;
		 ++x ;
 int f = d+ e++ ;
 System.out.println(d);
 System.out.println(e);
 System.out.println(f);
	 }
}
