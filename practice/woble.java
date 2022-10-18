import java.util.*;
class woble
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try(Scanner sc = new Scanner(System.in)){
		    int t = sc.nextInt();
		    String m = "";
		    sc.nextLine();
		    while(t-->0){
		        String s = sc.nextLine();
		        String g = sc.nextLine();
		        for(int i =0;i<= s.length()-1 ;i++){
		            if(s.charAt(i)==g.charAt(i)) m=m+"G";
		            else m=m+"E";
		        }
		        System.out.println(m);
		        }
		}
	}
}
