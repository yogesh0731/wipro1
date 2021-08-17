import java.util.*;
public class MaxValue {
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    int arr[] = new int[10];
	    for(int i=0;i<10;i++){
	        arr[i] = sc.nextInt();
	    }
	    int maximum = arr[0];
	    for(int i=0;i<10;i++){
	        if(arr[i]>maximum){
	            maximum=len[i];
	        }
	    }
	    int count=0;
	    for(int i=0;i<10;i++){
	    	if(arr[i]==maximum){
	    		count++;
	    	}
	    }
	    System.out.println(count);
	}
 }
