package university;

public class Student {
    private String name;
    private int age;
    private String idNumber;

    public Student() {
        super();
    }
    public Student(String name, int age, String idNumber) {
        super();
        this.name = name;
        this.age = age;
        this.idNumber = idNumber;
    }
    public String toString() {
        return "Student name=" + name + ", age=" + age + ", id=" + idNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String newName){
        this.name=newName;
    }
    public int getAge() {
        return age;
    }

    public void setAge(String newAge){
        this.name=newAge;
    }
    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String newIdNumber){
        this.name=newIdNumber;
    }
}