package empdatabse;

public class Emp implements Comparable
{
		String id;
		String name;
		double sal;
		int floorno;
		public Emp(String id, String name, double sal, int floorno) {
			super();
			this.id = id;
			this.name = name;
			this.sal = sal;
			this.floorno = floorno;
		}
		public String toString()
		{
			return id+" "+name;
		}
		public int compareTo(Object o1)
		{
			Emp e=(Emp)o1;
			int a=this.id.compareTo(e.id);
			return a;
//			if(this.sal>e.sal)
//			 {
//				 return 1;
//			 }
//			 if(this.sal==e.sal)
//			 {
//				 return 0;
//			 }
//			 else
//				 return -1;
		}
		
}
