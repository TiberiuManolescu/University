package university;
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    public Employee(int id,String firstName,String lastName,int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getName() {
        return firstName + " " + lastName;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return salary * 12;
    }
    public int raiseSalary(int percent){
        int raise = (salary*percent)/100;
        salary += raise;
        return salary;
    }
    public String toString(){
        return "id = " + id + " " + "name = " + getName() + " " + "salary = " + salary + " " + "AnnualSalary = " + " " + getAnnualSalary();
    }
}