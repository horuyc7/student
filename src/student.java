import java.util.*;

class student
{
  public static void main(String[] args)
  {
	  
	  ArrayList<newStudent> list = new ArrayList<newStudent>();


	 int userInt = displayMenu();
		

	  while(userInt != 16)
	  {
		 
		  switch(userInt)
		  {
		  	case 1:
		  		addStudent(list);

		  		break;
		  		
		  		
		  	case 2:
		  		removeStudent(list);

		  		break;
		  		
		  	case 3:
		  		addC(list, "", "");

		  		break;
		  		
		  	
		  	case 4:
		  		//removeC(list);

		  		
		  		break;
		  		
		  	case 5:
		  		displayStudent(list);
		  		break;
		  		
		  	case 6:
		  		Displaystudentdetail(list);
		  		break;
		  		
		  		
		  	case 7:
		  		Checkbalance(list);
		  		break;
		  		
		  	case 8:
		  		Addbalance(list);
		  		break;
		  		
		  	case 9:
		  		Addtardy(list);
		  		break;
		  		
		  	case 10:
		  		Addabsent(list);
		  		break;
		  		
		  	case 11:
		  		Addaddress(list);
		  		break;
		  		
		  	case 12:
		  		Changeaddress(list);
		  		break;
		  		

		  	case 13:
		  		Addparent(list);
		  		break;
		  		
		  	case 14:
		  		Removeparent(list);
		  		break;
		  		
		  	case 15:
		  		Choosestudent(list);
		  		break;
		  		
		  	default:
		  		
		  		break;
		  		

		  }
		  
		  userInt = displayMenu();
		  
	  }	
	
	
	  System.out.println("EXIT");


  }
  
  public static int displayMenu()
  {
	System.out.print("\n\n--------------MAIN MENU--------------\n");
	System.out.print("1. Add Student | 2. Remove Student\n");
	System.out.print("3. Add Course | 4. Remove Course\n");
	System.out.print("5. Display Student list | 6. Display Student list in detail\n");
	System.out.print("7. Check balance | 8. Add to balance\n");
	System.out.print("9. Add tardy | 10. Add absent\n");
	System.out.print("11. Add address | 12. Change address\n");
	System.out.print("13. Add parent | 14. Remove parent\n");
	System.out.print("15. Choose student\n");
	    
	    
	    
	System.out.print("16. Exit\n");
	
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter an integer: ");
	int userInt = input.nextInt();
		  
	

	
	return userInt;

  }
  
  
  public static int displayAltmenu()
  {
	System.out.print("\n\n--------------STUDENT MENU--------------\n");

	System.out.print("3. Add Course | 4. Remove Course\n");
	System.out.print("5. Display Student detail\n");
	System.out.print("7. Check balance | 8. Add to balance\n");
	System.out.print("9. Add tardy | 10. Add absent\n");
	System.out.print("11. Add address | 12. Change address\n");
	System.out.print("13. Add parent | 14. Remove parent\n");
	    
	System.out.print("16. Exit\n");
	
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter an integer: ");
	int userInt = input.nextInt();
		  
	

	return userInt;

  }
  
  
  public static void Choosestudent(ArrayList<newStudent> list)
  {
	  Scanner input = new Scanner(System.in);
	  
	  System.out.print("Enter student first name: ");
	  String userfname = input.nextLine();
	  
	  while(userfname.length() <= 0)
	  {
		  System.out.print("Reenter student first name: ");
		  userfname = input.nextLine();
	  }
	    
	  System.out.print("Enter student last name: ");
	  String userlname = input.nextLine();
	  
	  while(userlname.length() <= 0)
	  {
		  System.out.print("Reenter student last name: ");
		  userlname = input.nextLine();
	  }
	  

	  int userInt = displayAltmenu();
	  
	  
	  while(userInt != 16)
	  {
		 
		  switch(userInt)
		  {
		  		
		  	case 3:
		  		addC(list, userfname, userlname);

		  		break;
		  		
		  	
		  	case 4:
		  		//removeC(list, userfname, userlname);

		  		
		  		break;
		  		
		  	case 5:
		  		displaySpecificstudent(list, userfname, userlname);
		  		break;

		  		
		  	case 7:
		  		Checkbalance(list);
		  		break;
		  		
		  	case 8:
		  		Addbalance(list);
		  		break;
		  		
		  	case 9:
		  		Addtardy(list);
		  		break;
		  		
		  	case 10:
		  		Addabsent(list);
		  		break;
		  		
		  	case 11:
		  		Addaddress(list);
		  		break;
		  		
		  	case 12:
		  		Changeaddress(list);
		  		break;
		  		

		  	case 13:
		  		Addparent(list);
		  		break;
		  		
		  	case 14:
		  		Removeparent(list);
		  		break;
		  		
		  	case 15:
		  		Choosestudent(list);
		  		break;
		  		
		  	default:
		  		
		  		break;
		  		

		  }
		  
		  userInt = displayAltmenu();
		  
	  }	
		

	  
	 
	  
  }

  
  
  
  
  
  public static void Removeparent(ArrayList<newStudent> list)
  {
	  	Scanner input = new Scanner(System.in);
		    
		System.out.print("Enter student first name: ");
		String userfname = input.nextLine();
		
		
		System.out.print("Enter student last name: ");
		String userlname = input.nextLine();
		
		
		for(int i = 0; i < list.size(); i++)
		{
			if(userfname.equals(list.get(i).getfname()) && userlname.equals(list.get(i).getlname()))
			{
				if(list.get(i).getParent().length() > 0)
				{
					list.get(i).removeParent();
				}
				else
				{
					System.out.println("Parent name is emtpy");
				}
				
				
		    	return;
		    }
		   
		}
		
		
		System.out.printf("Student %s %s, not found", userfname, userlname);
  }
  
  
  public static void Addparent(ArrayList<newStudent> list)
  {
	  	Scanner input = new Scanner(System.in);
		    
		System.out.print("Enter student first name: ");
		String userfname = input.nextLine();
		
		
		System.out.print("Enter student last name: ");
		String userlname = input.nextLine();
		
		
		for(int i = 0; i < list.size(); i++)
		{
			if(userfname.equals(list.get(i).getfname()) && userlname.equals(list.get(i).getlname()))
			{
				System.out.print("Enter contact number: ");
				int parentcontact = input.nextInt();
				
				while(parentcontact <= 0 && parentcontact < 1000000000)
				{
					System.out.print("Reenter contact number: ");
					parentcontact = input.nextInt();
					
				}
				
				System.out.print("Enter parent first name: ");
				String parentfname = input.nextLine();
				String parentlname;
				
				if(parentfname.length() > 0)
				{
					System.out.print("Enter parent last name: ");
					parentlname = input.nextLine();
					
					if(parentlname.length() > 0)
					{
						list.get(i).addParent(parentfname, parentlname, parentcontact);
					}
					else
					{
						System.out.print("Reenter parent last name: ");
						parentlname = input.nextLine();
						
						list.get(i).addParent(parentfname, parentlname, parentcontact);
					}
				}
				else
				{
					System.out.print("Reenter parent first name: ");
					parentfname = input.nextLine();
					
						
					System.out.print("Enter parent last name: ");
					parentlname = input.nextLine();
					
					if(parentlname.length() > 0)
					{
						list.get(i).addParent(parentfname, parentlname, parentcontact);
					}
					else
					{
						System.out.print("Reenter parent last name: ");
						parentlname = input.nextLine();
						
						list.get(i).addParent(parentfname, parentlname, parentcontact);
					}
				
					
				}
				
				
				
		    	return;
		    }
		   
		}
		
		
		
		System.out.printf("Student %s %s, not found", userfname, userlname);
  }
  
  
  
  public static void Changeaddress(ArrayList<newStudent> list)
  {
	  	Scanner input = new Scanner(System.in);
		    
		System.out.print("Enter student first name: ");
		String userfname = input.nextLine();
		
		
		System.out.print("Enter student last name: ");
		String userlname = input.nextLine();
		
		
		for(int i = 0; i < list.size(); i++)
		{
			if(userfname.equals(list.get(i).getfname()) && userlname.equals(list.get(i).getlname()))
			{
				
				System.out.print("Enter new address: ");
				String userAddress = input.nextLine();
				
				if(userAddress.length() > 0)
				{
					list.get(i).changeAdress(userAddress);
				}
				else
				{
					System.out.print("Reenter new address: ");
					userAddress = input.nextLine();
					
					list.get(i).changeAdress(userAddress);
				}
				
				
				
		    	return;
		    }
		   
		}
		
		
		System.out.printf("Student %s %s, not found", userfname, userlname);
  }
  
  public static void Addaddress(ArrayList<newStudent> list)
  {
	  	Scanner input = new Scanner(System.in);
		    
		System.out.print("Enter student first name: ");
		String userfname = input.nextLine();
		
		
		System.out.print("Enter student last name: ");
		String userlname = input.nextLine();
		
		
		for(int i = 0; i < list.size(); i++)
		{
			if(userfname.equals(list.get(i).getfname()) && userlname.equals(list.get(i).getlname()))
			{
				
				System.out.print("Enter address: ");
				String userAddress = input.nextLine();
				
				if(userAddress.length() > 0)
				{
					list.get(i).addAddress(userAddress);
				}
				else
				{
					System.out.print("Reenter address: ");
					userAddress = input.nextLine();
					
					list.get(i).addAddress(userAddress);
				}
				
				
				
		    	return;
		    }
		   
		}
		
		
		System.out.printf("Student %s %s, not found", userfname, userlname);
  }
  
  public static void Addtardy(ArrayList<newStudent> list)
  {
	  	Scanner input = new Scanner(System.in);
		    
		System.out.print("Enter student first name: ");
		String userfname = input.nextLine();
		
		
		System.out.print("Enter student last name: ");
		String userlname = input.nextLine();
		
		
		for(int i = 0; i < list.size(); i++)
		{
			if(userfname.equals(list.get(i).getfname()) && userlname.equals(list.get(i).getlname()))
			{

				list.get(i).addTardy();
				
		    	return;
		    }
		   
		}
		
		
		System.out.printf("Student %s %s, not found", userfname, userlname);
  }
  
  public static void Addabsent(ArrayList<newStudent> list)
  {
	  	Scanner input = new Scanner(System.in);
		    
		System.out.print("Enter student first name: ");
		String userfname = input.nextLine();
		
		
		System.out.print("Enter student last name: ");
		String userlname = input.nextLine();
		
		
		for(int i = 0; i < list.size(); i++)
		{
			if(userfname.equals(list.get(i).getfname()) && userlname.equals(list.get(i).getlname()))
			{

				list.get(i).addAbsent();
				
		    	return;
		    }
		   
		}
		
		
		System.out.printf("Student %s %s, not found", userfname, userlname);
  }
  
  public static void Addbalance(ArrayList<newStudent> list)
  {
	  	Scanner input = new Scanner(System.in);
		    
		System.out.print("Enter student first name: ");
		String userfname = input.nextLine();
		
		
		System.out.print("Enter student last name: ");
		String userlname = input.nextLine();
		
		
		for(int i = 0; i < list.size(); i++)
		{
			if(userfname.equals(list.get(i).getfname()) && userlname.equals(list.get(i).getlname()))
			{
				System.out.print("Enter amount: ");
				int userAmount = input.nextInt();
				
				
				list.get(i).addBalance(userAmount);
				
				
		    	return;
		    }
		   
		}
		
		
		System.out.printf("Student %s %s, not found", userfname, userlname);
  }

  
  public static void Checkbalance(ArrayList<newStudent> list)
  {
	  	Scanner input = new Scanner(System.in);
		    
		System.out.print("Enter student first name: ");
		String userfname = input.nextLine();
		
		System.out.print("Enter student last name: ");
		String userlname = input.nextLine();
		
		
		for(int i = 0; i < list.size(); i++)
		{
			if(userfname.equals(list.get(i).getfname()) && userlname.equals(list.get(i).getlname()))
			{
				list.get(i).displayBalance();
				
		    	return;
		    }
		   
		}
		
		
		System.out.printf("Student %s %s, not found", userfname, userlname);
  }
  


  public static void addStudent(ArrayList<newStudent> list)
  {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter student first name: ");
    String userfname = input.nextLine();


    System.out.print("Enter student last name: ");
    String userlname = input.nextLine();


    System.out.print("Enter student age: ");
    int userAge = input.nextInt();

    System.out.print("Enter student grade: ");
    int userGrade = input.nextInt();



    list.add(new newStudent(userfname, userlname, userAge, userGrade));
    
    
    
    System.out.print("Student created\n");
    

    
  }
  
  
  public static void removeStudent(ArrayList<newStudent> list)
  {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter student first name: ");
    String userfname = input.nextLine();
    
    System.out.print("Enter student last name: ");
    String userlname = input.nextLine();


    for(int i = 0; i < list.size(); i++)
    {
    	if(userfname.equals(list.get(i).getfname()) && userlname.equals(list.get(i).getlname()))
    	{
    		list.remove(i);
    		System.out.printf("Student %s %s, removed\n", userfname, userlname);

    		return;
    	}
   
    }
    
    
    System.out.printf("Student %s %s, not found", userfname, userlname);
    
    
  }

  

  
public static void addC(ArrayList<newStudent> list, String fname, String lname)
{
	String userfname = null, userlname = null;
	Scanner input = new Scanner(System.in);
	
	if(fname.length() >= 0 && lname.length() >= 0)
	{
		for(int i = 0; i < list.size(); i++)
		{
		    	if(fname.equals(list.get(i).getfname()) && lname.equals(list.get(i).getlname()))
		    	{
		    		System.out.print("Enter course name: ");
		    		String userCourse = input.nextLine();
		
		    		while(userCourse.length() <= 0)
		    		{
		    				System.out.print("Reenter course name: ");
		    				userCourse = input.nextLine();
		    	    	
		    	    }
		    	  
		    	    
		    	    list.get(i).addCourse(userCourse);
		    	    return;
		   
		    		
		         }
		   
		 }
		System.out.printf("Student %s %s, not found", userfname, userlname);
		return;
	}
	

	System.out.print("Enter student first name: ");
	 userfname = input.nextLine();
	 
	 while(userfname.length() <= 0)
	  {
		  System.out.print("Reenter student first name: ");
		  userfname = input.nextLine();
	  }
	    
	 System.out.print("Enter student last name: ");
	 userlname = input.nextLine();
	 
	 while(userlname.length() <= 0)
	  {
		  System.out.print("Reenter student last name: ");
		  userlname = input.nextLine();
	  }
	    
	    
	for(int i = 0; i < list.size(); i++)
	{
	    	if(userfname.equals(list.get(i).getfname()) && userlname.equals(list.get(i).getlname()))
	    	{
	    		System.out.print("Enter course name: ");
	    		String userCourse = input.nextLine();
	
	    		while(userCourse.length() <= 0)
	    		{
	    				System.out.print("Reenter course name: ");
	    				userCourse = input.nextLine();
	    	    	
	    	    }
	    	  
	    	    
	    	    list.get(i).addCourse(userCourse);
	    	    return;
	   
	    		
	         }
	   
	 }

    System.out.printf("Student %s %s, not found", userfname, userlname);

}



public static void displaySpecificstudent(ArrayList<newStudent> list, String fname, String lname)
{
	if(list.size() == 0)
	{
		System.out.println("List is empty\n");
		return;
	}
	
	for(int i = 0; i < list.size(); i++)
	{
		if(fname.equals(list.get(i).getfname()) && lname.equals(list.get(i).getlname()))
    	{
			list.get(i).displayStudendetail();
			return;
    	}
	}
	
	System.out.printf("Student %s %s, not found", fname, lname);
	
}


public static void displayStudent(ArrayList<newStudent> list)
{
	if(list.size() == 0)
	{
		System.out.println("List is empty\n");
		return;
	}
	
	for(int i = 0; i < list.size(); i++)
	{
		list.get(i).display();
	}
}


public static void Displaystudentdetail(ArrayList<newStudent> list)
{
	if(list.size() == 0)
	{
		System.out.println("List is empty\n");
		return;
	}
	
	for(int i = 0; i < list.size(); i++)
	{
		list.get(i).displayStudendetail();
	}
}
    
  
}