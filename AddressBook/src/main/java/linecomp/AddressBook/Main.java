package linecomp.AddressBook;

import java.util.Scanner;

public class Main {
      public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AddressBook objmain=new AddressBook();
		int i=0;
		while(i==0) {
		System.out.println("1.Add\n2.Edit\n3.Delete");
		System.out.println("Enter your choice");
		int n=sc.nextInt();
		if(n==1)
		{
			Contact obj=new Contact();
			System.out.println("Add a contact");
			System.out.println("Enter the first name :");
			obj.setFirstName(sc.nextLine());
			sc.nextLine();
			System.out.println("Enter the last name :");
            obj.setLastName(sc.nextLine());
			System.out.println("Enter the city :");
			obj.setCity(sc.nextLine());
			System.out.println("Enter the state :");
			obj.setState(sc.nextLine());
			System.out.println("Enter the zip :");
			obj.setZip(Long.parseLong(sc.nextLine()));
			System.out.println("Enter the phone no :");
			obj.setPhoneNumber(sc.nextLong());
			System.out.println("Enter the emailid :");
			obj.setEmailId(sc.nextLine());
			sc.nextLine();
			objmain.addContact(obj);
		}
		if(n==2)
		{
			System.out.println("Edit Details :");
			System.out.println("Enter the first name :");
			String fname=sc.nextLine();
			sc.nextLine();
			System.out.println("Enter the last name :");
			String lname=sc.nextLine();
            //Contact obj1=new Contact();
            objmain.editByName(fname,lname);
			/*System.out.println("Enter the city :");
            String city=sc.nextLine();
			System.out.println("Enter the state :");
            String state=sc.nextLine();
			System.out.println("Enter the zip :");
            Long zip=sc.nextLong();
			System.out.println("Enter the phone no :");
            Long ph=sc.nextLong();
			System.out.println("Enter the emailid :");
            String id=sc.nextLine();*/
         }
		if(n==3) {
			System.out.println("Delete Details :");
			System.out.println("Enter the first name :");
			String fname=sc.nextLine();
			sc.nextLine();
			System.out.println("Enter the last name :");
			String lname=sc.nextLine();
			//Contact obj2=new Contact();
			objmain.deleteByName(fname, lname);
			
		}
       }
	}
}
