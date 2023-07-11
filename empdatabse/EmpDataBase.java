package empdatabse;
import java.util.Arrays;
import java.util.Scanner;
public class EmpDataBase 
{
		Emp[]e1=new Emp[2];
		Scanner sc=new Scanner(System.in);
		public void addEmp()
		{
			//i=0
			for(int i=0;i<e1.length;i++)
			{
				if(e1[i]==null)
				{
					System.out.println("etner id");
					String id=sc.next();
					System.out.println("enter name");
					String name=sc.next();
					System.out.println("enter sal");
					double sal=sc.nextDouble();
					System.out.println();
					System.out.println("Enter the floorno");
					int floorno=sc.nextInt();
					Emp e=new Emp(id,name,sal,floorno);
				     e1[i]=e;
				     System.out.println("emp is added");
				     return;
				}
			}
			System.out.println("database is full");
		}
		public void removeEmp()
		{
			try {
			System.out.println("enter id");
			String id=sc.next();
			for(int i=0;i<e1.length;i++)
			{
//				if(e1[i]!=null)  try provide is if array is null it will show id not found
//				{
					Emp e=e1[i];
					if(e.id.equals(id))
					{
						e1[i]=null;
						System.out.println("emp is removed");
					    return;
					}
				
			}
			}//end of try block
			catch(NullPointerException e)
			{
			System.out.println("id not found");
			}
			
		}
		public void searchEmp()
		{
			System.out.println("enter id");
			String id=sc.next();
			for(int i=0;i<e1.length;i++)
			{
				if(e1[i]!=null)
				{
					Emp e=e1[i];
					if(e.id.equals(id))
					{
						System.out.println(e);
						return;
					}
				}
			}
			System.out.println("id is not found");
		}
		public void updateEmp() {
			System.out.println("enter id");
			String id=sc.next();
			for(int i=0;i<e1.length;i++)
			{
				if(e1[i]!=null)
				{
					Emp e=e1[i];
					if(e.id.equals(id))
					{
						System.out.println("1.name");
						System.out.println("2.sal");
						System.out.println("3.floor no");
						switch(sc.nextInt())
						{
						case 1:
						{
							System.out.println("enter name");
							e.name=sc.next();
							System.out.println("name is updated");
							return;
						}
						case 2:
						{
							System.out.println("enter sal");
							e.sal=sc.nextDouble();
							System.out.println("sal is updated");
						    return;
						}
						case 3:
						{
							System.out.println("enter floor no");
							e.floorno=sc.nextInt();
							System.out.println("floor  is updated");
						    return;
							
						}
						}
					}
				}
			}
			System.out.println("id is not found");
		}
		public void displayEmp()
		{
			
			for(int i=0;i<e1.length;i++)
			{
				System.out.println(e1[i]);
			}
		}
		public void asc( ) 
		{
			try {
			Arrays.sort(e1);
			}
			catch(NullPointerException e)
			{
				System.out.println("data is insufficent to sort");
			}
			
			
			/*int count=0;
//			for(int i=0;i<e1.length;i++)
//			 {
//				 if(e1[i]!=null)
//				 {
//					 count++;
//				 }
//			 }
//			 if(count>1)
//			 {
//				 Arrays.sort(e1);
//			 }
//			 else
//			 {
//				 System.out.println("Insufficient data to sort");
//			 }
			 */
			}
		
}
