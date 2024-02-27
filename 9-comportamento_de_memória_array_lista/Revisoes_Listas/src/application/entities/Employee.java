package application.entities;

public class Employee {
	
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee() {
		
	}

	public Employee(Integer id, String name, Double salary) {		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}
	
	public void increaseSalary(Double percentage) {
		double porcen = (percentage / 100) + 1;
		salary = getSalary() * porcen;
	}
	
	@Override
	public String toString(){
		return this.getId() + ", " + this.getName() + ", " + String.format("%.2f", this.getSalary());
	}
}
