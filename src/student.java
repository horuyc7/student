import java.util.*;

class student
{
  public static void main(String[] args)
  {
	  
	  ArrayList<newStudent> list = new ArrayList<newStudent>();


	 int userInt = displayMenu();
		

	  while(userInt != 12)
	  {
		  
		  switch(userInt)
		  {
		  	case 1:
		  		addStudent(list);
		  		userInt = displayMenu();
		  		
		  		break;
		  		
		  		
		  	case 2:
		  		removeStudent(list);
		  		userInt = displayMenu();
		  		
		  		break;
		  		
		  	case 3:
		  		addC(list);
		  		userInt = displayMenu();
		  		
		  		break;
		  	
		  	case 4:
		  		//removeC(list);
		  		userInt = displayMenu();
		  		
		  		break;
		  		
		  	case 5:
		  		displayStudent(list);
		  		userInt = displayMenu();
		  		
		  		break;
		  		
		  	case 6:
		  		Checkbalance(list);
		  		userInt = displayMenu();
		  		
		  		break;
		  		
		  	case 7:
		  		Addbalance(list);
		  		userInt = displayMenu();
		  		
		  		break;
		  		
		  	case 8:
		  		Addtardy(list);
		  		userInt = displayMenu();
		  		
		  		break;
		  		
		  	case 9:
		  		Addabsent(list);
		  		userInt = displayMenu();
		  		
		  		break;
		  		
		  	case 10:
		  		
		  		
		  	case 11:
		  		
		  	
		  		
		  		
		  		
		  	default:
		  		userInt = displayMenu();
		  		
		  		break;
		  		
		  	
	          	
		  }
	  }	
	
	
	  System.out.println("EXIT");


  }
  
  public static int displayMenu()
  {
    System.out.print("--------------MAIN MENU--------------\n");
    System.out.print("1. Add Student\n");
    System.out.print("2. Remove Student\n");
    System.out.print("3. Add Course\n");
    System.out.print("4. Remove Course\n");
    System.out.print("5. Display Student list\n");
    System.out.print("6. Check balance\n");
    System.out.print("7. Add to balance\n");
    System.out.print("8. Add tardy\n");
    System.out.print("9. Add absent\n");
    System.out.print("10. Add address\n");
    System.out.print("11. Change address\n");
    
    System.out.print("12. Exit\n");


    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");

    int userInt = input.nextInt();
    
    input.close();
    
    return userInt;

  }
  
  
  public static int displayAltMenu()
  {
    System.out.print("--------------STUDENT MENU--------------\n");
    System.out.print("1. Add Course\n");
    System.out.print("2. Remove Course\n");
    System.out.print("3. Check balance\n");
    System.out.print("4. Add to balance\n");
    System.out.print("5. Add tardy\n");
    System.out.print("6. Add absent\n");
    System.out.print("7. Add address\n");
    System.out.print("8. Change address\n");
    
    System.out.print("9. Exit\n");


    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");

    int userInt = input.nextInt();
    
    input.close();
    
    return userInt;

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
				input.close();
		    	return;
		    }
		   
		}
		
		input.close();
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
				input.close();
		    	return;
		    }
		   
		}
		
		input.close();
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
				
				input.close();
		    	return;
		    }
		   
		}
		
		input.close();
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
				input.close();
		    	return;
		    }
		   
		}
		
		input.close();
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
    
    
    
    input.close();
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
    		input.close();
    		return;
    	}
   
    }
    
    input.close();
    
    System.out.printf("Student %s %s, not found", userfname, userlname);
    
    
  }

  
  
public static void addC(ArrayList<newStudent> list)
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
    		System.out.print("Enter course name: ");
    	    String userCourse = input.nextLine();
    	    
    	    
    	    list.get(i).addCourse(userCourse);
    	    input.close();
    	    return;
    		
    	}
   
    }
    
    input.close();
    
    
    System.out.printf("Student %s %s, not found", userfname, userlname);


  
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
    
  
}