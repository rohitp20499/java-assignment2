package assignment2java;

import java.util.List;

public class MainEx2 {

	public static void main(String[] args) {

		Employee aemp[] = new Employee[10];
		
		aemp[0] = new Employee(1, "name1","MCA","branch9",564f);
		aemp[1] = new Employee(2, "name2","CS","branch1",454f);
		aemp[2] = new Employee(3, "name3","IT","branch9",34f);
		aemp[3] = new Employee(4, "name4","MCA","branch6",22f);
		aemp[4] = new Employee(5, "name5","B.Tech","branch2",245f);
		aemp[5] = new Employee(6, "name6","B.Arch","branch1",1663f);
		aemp[6] = new Employee(7, "name7","IT","branch3",645f);
		aemp[7] = new Employee(8, "name7","MCA","branch2",234f);
		aemp[8] = new Employee(9, "name7","CS","branch4",674f);
		aemp[9] = new Employee(10, "name7","B.Tech","branch3",343f);

		Employee emp1[] = new EmployeeUtil(aemp).sortBOnDept();
		System.out.println("_____Sorting Based on dept____________________________________________________________________");
		System.out.println();	
		for(int i=0;i<emp1.length;i++){
			System.out.println("id:"+emp1[i].getId()+"\t Name:"+emp1[i].getName()+"\t branch:"+emp1[i].getBranch()+"\t Salary:"+emp1[i].getSalary()+"\t Dept: "+emp1[i].getDept());
		}
		System.out.println("_____Sorting Based on Salary____________________________________________________________________");
		System.out.println();
		Employee emp2[] = new EmployeeUtil(aemp).sortBOnSalary();
		for(int i=0;i<emp2.length;i++){
			System.out.println("id:"+emp1[i].getId()+"\t Name:"+emp1[i].getName()+"\t branch:"+emp1[i].getBranch()+"\t Salary:"+emp1[i].getSalary()+"\t Dept: "+emp1[i].getDept());
		}
		System.out.println("________Emps greater than avg salary_________________________________________________________________");
		List<Employee> emp3 = new EmployeeUtil(aemp).empSalaryGreatorAvgSalary();
		for(int i=0;i<emp3.size();i++){
//			System.out.println("id:"+emp1[i].getId()+"\t Name:"+emp1[i].getName()+"\t branch:"+emp1[i].getBranch()+"\t Salary:"+emp1[i].getSalary()+"\t Dept: "+emp1[i].getDept());
			System.out.println("id:"+emp3.get(i).getId()+"\t Name:"+emp3.get(i).getName()+"\t branch:"+emp3.get(i).getBranch()+"\t Salary:"+emp3.get(i).getSalary()+"\t Dept: "+emp3.get(i).getDept());
		}
	}

}
