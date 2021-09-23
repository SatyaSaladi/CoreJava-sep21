package test;

public class ConditionExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=50;i++) {
			
			if(i%2!=0) {
				System.out.println("Odd Numbers " +i);
			}else {
				System.out.println("Even Numbers " +i);

				
			}
		}
		//====================================
		int age = 18; //eligible for voting
		age = 17;//sorry you will eligible for voting by next year
        age = 16;//Not eligible for voting
        if(age==18) {
        	System.out.println("Eligible for voting");
        }else if(age==17) {
        	System.out.println("Sorry not Eligible for voting");
        }
	}

}
