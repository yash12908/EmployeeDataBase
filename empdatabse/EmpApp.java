package empdatabse;

public class EmpApp 
{
public static void main(String[] args) {
		
		EmpDataBase ed=new EmpDataBase();
	   for(;;)
	   {
		   System.out.println("1.addEmp");
		   System.out.println("2.removeEmp");
		   System.out.println("3.searchEmp");
		   System.out.println("4.updateEmp");
		   System.out.println("5.displayEmp");
		   System.out.println("6.sort");
		   System.out.println(" 7.Exit Application");
		   switch(ed.sc.nextInt())
		   {
		   case 1:
		   {
			   ed.addEmp();
			   break;
		   }
		   case 2:
		   {
			   ed.removeEmp();
			   break;
		   }
		   case 3:
		   {
			   ed.searchEmp();
			   break;
		   }
		   case 4:
		   {
			   ed.updateEmp();
			   break;
		   }
		   case 5:
		   {
			   ed.displayEmp();
			   break;
			   
		   }
		   case 6:
		   {
			  ed.asc();
			  break;
		   }
		   case 7:
		   {
			   System.out.println("application closed");
			   System.exit(0);
		   }
		   
		  
		   
		   }
	   }
	}
}
