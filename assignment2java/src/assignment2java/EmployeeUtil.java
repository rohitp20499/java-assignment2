package assignment2java;

import java.util.ArrayList;
import java.util.List;

public class EmployeeUtil {
	
	Employee []amps;
	
	public EmployeeUtil(Employee []amps) {
		this.amps = amps;
	}
	
	//sort method b on branch
		public Employee[] sortBOnDept(){
			for(int i=0;i<amps.length;i++){
				for(int j=0;j<amps.length - i -1;j++){
					if(amps[j].getDept().compareTo(amps[j+1].getDept())>0){
						Employee etmp = amps[j];
						amps[j] = amps[j+1];
						amps[j+1] = etmp;
					}
				}
			}	
			return amps;
		}
		
		public Employee[] sortBOnSalary(){
			for(int i=0;i<amps.length;i++){
				for(int j=0;j<amps.length - i -1;j++){
					if(amps[j].getSalary() > amps[j+1].getSalary()) {
						Employee etmp = amps[j];
						amps[j] = amps[j+1];
						amps[j+1] = etmp;	
					}
				}
			}	
			return amps;
		}
		public List<Employee> empSalaryGreatorAvgSalary(){
			float sal = 0f;
			int j=0;
			List<Employee> list = new ArrayList<Employee>();
			for(int i=0;i<amps.length;i++){
				sal += amps[i].getSalary();
			}
			float avgSal = sal/amps.length;
			System.out.println("Avg salary is  : "+avgSal);
			for(int i=0;i<amps.length;i++) {
				if(amps[i].getSalary()>=avgSal && j<amps.length) {
//					System.out.println(amps[i].getSalary()+">="+avgSal+" "+amps[i].getDept());
					int id = amps[i].getId();
					String name = amps[i].getName();
					String branch = amps[i].getBranch();
					float sal1  = amps[i].getSalary();
					String dept = amps[i].getDept();
					list.add(new Employee(id, name, dept, branch, sal1));
				}
			}
			return list;
		}
}
