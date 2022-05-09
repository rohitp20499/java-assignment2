package assignment2java;

class Employee{
	private int id;
	private String name;
	private String dept;
	private String branch;
	private float salary;
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	Employee(){
//		System.out.println("no arg cons called");
	}
	
	Employee(int id, String name, String dept, String branch,float salary){
		this();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.branch = branch;
		this.salary = salary;
	}
	Employee setId(int id){
		this.id = id;
		return this;
	}
	
	Employee setName(String name){
		this.name = name;
		return this;
	}
	
	Employee setSalary(float salary){
		this.salary = salary;
		return this;
	}
	
	
	public float getSalary() {
		return salary;
	}

	void display(){
		System.out.println("Employee ID:"+this.id+" Name:"+name+" Dept:"+dept+" Brnahc:"+branch+" Salary:"+salary);
	}
}


