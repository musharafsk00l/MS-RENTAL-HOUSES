package pack1;
import java.util.Arrays;
import java.util.Scanner;

public class RentHouse  
{
	String no1="1.Location";
	String no2="2.Roomtype";
	String no3="3.Budgetfree";
	int num1=0;
	Scanner sc=new Scanner(System.in);

	void rentHouse()
	{
		System.out.println("*** Welcom to MS RENTAL HOUSES ***");
		System.out.println("Press 0 for Requirements");
		int num1=sc.nextInt();
		if(num1==0) {
			System.out.println("\nPlease choose your Requirements(only one number):");
			System.out.println(no1+"\n");
			System.out.println(no2+"\n");
			System.out.println(no3+"\n");
		}
		
		int num=sc.nextInt();
		if(num==1)
		{
			System.out.println("You selected,"+num+".Location option");
			System.out.println("Please enter Location :");
			String place=sc.next();
			System.out.println("\n"+place+" Location");
		}
		
		else if(num==2) 
		{
			System.out.println("You selected,"+num+".Roomtypes option");
			System.out.println("Please enter Roomtype");
			System.out.println("Please select Location option.");
		}
		else
			System.out.println("You selected,"+num+".Budgetfree option");
			
		System.out.println("Please press 2 goto back step roomtype");
		int num2=sc.nextInt();
		
		if(num2==2)
		{
			System.out.println("Which type of rooms do you want! Like:(1bhk,2bhk,3bhk,4bhk,singleroom)\n");
			sc.nextLine();
			String room=sc.nextLine();
			switch(room)
			{
			case "1bhk","1BHK":
				System.out.println(room+" flat details:");
				System.out.println("Single bedroom\nSingle door refrigerator\n20% Exctra space\n------------\nTotal rent=20,000");
				System.out.println("Please enter how many members to live in "+room);
				
				String members[]=new String[sc.nextInt()];
				System.out.println("Please enter "+members.length+" names for living:");
				
				for(int i=0;i<=members.length-1;i++)
					members[i]=sc.next();
				System.out.println("\n"+members.length+" members for "+Arrays.toString(members)+" were conformed for living in "+room);
				System.out.println("Will you procced with payment?\nTotal rent amount :\n-----------\n20,000\n-----------\nPlease enter '@ibl");
				String pay=sc.next();
				System.out.println("7569366956"+pay);
				System.out.println("Thanks for visiting MS RENTAL HOUSES Page!!!");
				
				break;
			case "2bhk","2BHK":
				System.out.println(room+" flat details:");
				System.out.println("Double bedroom\nSingle door refrigerator\nSome exctra furniture\n20% Exctra space\n-------------\nTotal rent=30,000");
				System.out.println("Please enter how many members to live in "+room);
				
				String members1[]=new String[sc.nextInt()];
				System.out.println("Please enter "+members1.length+" names for living:");
				
				for(int i=0;i<=members1.length-1;i++)
					members1[i]=sc.next();
				System.out.println("\n"+members1.length+" members for "+Arrays.toString(members1)+" were conformed for living in "+room);
				System.out.println("Will you procced with payment?\nTotal rent amount :\n-----------\n30,000\n-----------\nPlease enter '@ibl");
				String pay1=sc.next();
				System.out.println("7569366956"+pay1);
				System.out.println("Thanks for visiting MS RENTAL HOUSES Page!!!");
				
				break;
			case "3bhk","3BHK":
				System.out.println(room+" flat details:");
				System.out.println("Three bedroom\nDouble door refrigerator\nSome exctra furniture\n20% Exctra space\n-------------\nTotal rent=36,000");
				System.out.println("Please enter how many members to live in "+room);
				
				String members2[]=new String[sc.nextInt()];
				System.out.println("Please enter "+members2.length+" names for living:");
				
				for(int i=0;i<=members2.length-1;i++)
					members2[i]=sc.next();
				System.out.println("\n"+members2.length+" members for "+Arrays.toString(members2)+" were conformed for living in "+room);
				System.out.println("Will you procced with payment?\nTotal rent amount :\n-----------\n36,000\n-----------\nPlease enter '@ibl");
				String pay2=sc.next();
				System.out.println("7569366956"+pay2);
				System.out.println("Thanks for visiting MS RENTAL HOUSES Page!!!");
				
				break;
			case "4bhk","4BHK":
				System.out.println(room+" flat details:");
				System.out.println("2 Double bedroom\nSingle door refrigerator\nSome exctra furniture\n20% Exctra space\n-------------\nTotal rent=40,000");
				System.out.println("Please enter how many members to live in "+room);
				
				String members3[]=new String[sc.nextInt()];
				System.out.println("Please enter "+members3.length+" names for living:");
				
				for(int i=0;i<=members3.length-1;i++)
					members3[i]=sc.next();
				System.out.println("\n"+members3.length+" members for "+Arrays.toString(members3)+" were conformed for living in "+room);
				System.out.println("Will you procced with payment?\nTotal rent amount :\n-----------\n40,000\n-----------\nPlease enter '@ibl");
				String pay3=sc.next();
				System.out.println("7569366956"+pay3);
				System.out.println("Thanks for visiting MS RENTAL HOUSES Page!!!");
				
				break;
			case "single room","SINGLE ROOM":
				System.out.println(room+" flat details:");
				System.out.println("Single room\nAttached bathroom\n------------\nTotal rent=10,000");
				
				System.out.println("Please enter how many members to live in "+room);
				
				String members4[]=new String[sc.nextInt()];
				System.out.println("Please enter "+members4.length+" names for living:");
				
				for(int i=0;i<=members4.length-1;i++)
					members4[i]=sc.next();
				System.out.println("\n"+members4.length+" members for "+Arrays.toString(members4)+" were conformed for living in "+room);
				System.out.println("Will you procced with payment?\nTotal rent amount :\n-----------\\n10,000\\n-----------\nPlease enter '@ibl");
				String pay4=sc.next();
				System.out.println("7569366956"+pay4);
				System.out.println("Thanks for visiting MS RENTAL HOUSES Page!!!");
				break;
			default:
				System.out.println("Roomtype invalid.\nPlease type again!!\n");
			}
		}
		
		
	}
	public static void main(String[] args) 
	{
		RentHouse obj=new RentHouse();
		obj.rentHouse();
	}
}
