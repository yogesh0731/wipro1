import java.util.*;
public class Average {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int sum=0;
	    for(int i=0;i<10;i++){
	        int n = sc.nextInt();
	        sum += n;
	    }
	    System.out.println(sum/10);
	    
	}
}
