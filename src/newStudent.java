import java.util.*;

public class newStudent
{
  private int age;
  private String fname;
  private String lname;
  private int grade;
  private String parentfname;
  private String parentlname;
  private int parentcontact;
  private String address;
  private int balance;
  private int absent;
  private int tardy;
  private List<String> course = new ArrayList<String>();
  
  

  public newStudent(String fname, String lname, int age, int grade)
  {
    this.age = age;
    this.fname = fname;
    this.lname = lname;
    this.grade = grade;
    this.balance = 0;

  }
  
  
  public void addAddress(String addy)
  {
	  this.address = addy;
	  System.out.printf("%s added to %s\n", addy, fname);
  }
  
  public void addTardy()
  {
	  this.tardy++;
	  System.out.println("Tardies increased");
  }
  
  public void addAbsent()
  {
	  this.absent++;
	  System.out.println("Absent increased");
  }
  
  public void displayBalance()
  {
	  System.out.printf("%s balance: %d\n", fname, balance);
  }
  
  public void addBalance(int b)
  {
	  this.balance += b;
	  System.out.printf("%d added to %s balance\n", b, fname);
  }
  

  public void addCourse(String c)
  {
    course.add(c);
    System.out.printf("Course: %s, added.\n", c);
  }
  

  public void removeCourse(String c)
  {
    if(course.remove(c))
    {
      course.remove(c);
      System.out.printf("Course: %s, removed.\n", c);
    }
    else
    {
      System.out.print("Course not found.\n");
    }

  }

  public String getlname()
  {
    return lname;
  }


  public String getfname()
  {
    return fname;
  }

  public int getage()
  {
    return age;
  }


  public int getgrade()
  {
    return grade;
  }



  public void display()
  {
    System.out.printf("First name = %s, Last name = %s, Age = %d, Grade = %d\n", fname, lname, age, grade);
    
    if(course.size() > 0)
    {
    	System.out.printf("Course: ");
    	
    	for(int i = 0; i < course.size(); i++)
    	{
    		if(i == course.size() - 1)
    		{
    			System.out.printf("%s\n", course.get(i));
    		}
    		else
    		{
    			System.out.printf("%s, ", course.get(i));
    		}
    		
    	}
    }
    else
    {
    	return;
    }
  }






}
