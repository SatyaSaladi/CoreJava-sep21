package test;

public class LoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i; 
		for(i=1;i<=10;i++) {
			System.out.println(i);
		}
		//=========================================
		
		int x = 1;
		while(x<=10) {
			System.out.println(x);
			
			x = x+1;//x++;
			
			
		}
		//=========================================
		int n1 = 436721;
		int count=0;
		while(n1>0) {
			
		int r = n1%10;
		System.out.println(r);
		count++;
		n1 = n1/10;
		}
		System.out.println("Total digits are " + count);
		//========================================
		int n2=0;
		do {
			System.out.println(n2);
			n2--;
			
			
		}while(n2>0);
		}

}
