package test;

public class StringExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String FName = "Satya";
		String Lname = "Saladi";
		String FullName = FName+ " " +Lname;
		System.out.println("Full name is " +FullName);
		System.out.println("Length of Fullname is " + FullName.length());
		System.out.println("Name in upper case" + FullName.toUpperCase());
		String NewName = FullName.replace("  ", " ,");
		System.out.println("New name is " +NewName);
		
		

	}

}
