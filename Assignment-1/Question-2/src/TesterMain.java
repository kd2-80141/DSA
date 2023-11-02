
public class TesterMain {

	public static void main(String[] args) {

		  Employee  emp [] =  {
				  new Employee(1011, "Rika", 10000.0),
				  new Employee(1031 , "Ackerman" , 99999.9),
				  new Employee(1111 , "Hacker" , 858585.85),
				  new Employee(1331 , "Ace" , 9089099.00),
				  new Employee(1831 , "Danny" , 35698.36),
	};
            
		  int searchempid = 1331;
		  String searchname= "Ace";
		  double searchsalary = 9089099.00;
		  
		  // search by id
		   for(Employee e1:emp)
			  if(e1.empid== searchempid)
			System.out.println("Employee found by id -->" + e1.name );
		   
		  // search by name
		  for(Employee e2 : emp)
			  if(e2.name.equals(searchname))
				  System.out.println("Employee found by name -->" + e2.empid);
		  
		  
		  // search by 
		  for (Employee e3 : emp)
			  if(e3.name.equals(searchname))
				  System.out.println("Salary of Employee is--> " + e3.salary );
}
}
