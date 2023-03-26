package university;

import org.w3c.dom.css.Rect;
public class Main {
    public static void main(String[] args) {

        //Student_lab2
        Student student_1 = new Student("Popescu", 34, "1950101285345");
        Student student_2 = new Student("Victor", 12, "1940303243564");
        Student student_3 = new Student("Florin", 12, "1990404239576");

        System.out.println(student_1);
        System.out.println(student_2);
        System.out.println(student_3);

        //Vehicle_lab2
        Car myCar = new Car(); // Create a myCar object
        // Call the honk() method (from the vehicle class) on the myCar object
        myCar.honk();
        // Display the value of the brand attribute (from the Vehicle class)
        // the value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.getModelName());

        //Outer+InnerCass_lab2
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);

        //Circle_lab2
        Circle c1 = new Circle();
        Circle c2 = new Circle(6.89);
        Circle c3 = new Circle(8.56, "blue");

        System.out.println("Circle 1 : " + c1.getArea());
        System.out.println("Circle 2 : " + c2.getArea());
        System.out.println("Circle 3 : " + c3.getArea() + " " + c3.getColor());

        //Rectangle_lab2
        Rectangle rectangle1 = new Rectangle(500, 300);
        rectangle1.setLength(800);
        rectangle1.setWidth(600);

        System.out.println("length = " + rectangle1.getLength());
        System.out.println("width = " + rectangle1.getWidth());
        System.out.println("Area = " + rectangle1.getArea());
        System.out.println("Perimeter = " + rectangle1.getPerimeter());

        //Employee_lab2
        Employee employee1 = new Employee(453353,"Vlad","Popescu",3000);
        Employee employee2 = new Employee(445651,"Andrei","Ionica",5000);

        employee1.raiseSalary(30);
        employee2.raiseSalary(50);

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());

        //Account_lab2
        Account account1 = new Account("415151","Victor");
        Account account2 = new Account("415345","Vlad");

        account1.credit(100);
        account2.debit(3);
        account1.transferTo(account2,5);

        System.out.println(account1.toString());
        System.out.println(account2.toString());

        //Rectangle2_lab3
        Rectangle2 rectangle2 = new Rectangle2(1.0,1.0,"white",false);

        System.out.println(rectangle2.toString());

        //Circle2_lab3
        Circle2 circle2 = new Circle2(3,"red",true);

        System.out.println(circle2.toString());

        //shape_lab3
        Shape shape = new Shape("red",true);

        System.out.println(shape.toString());

        //Square_lab3
        Square square = new Square(1.0,"blue",false);

        System.out.println(square.toString());

        //Author_lab4
    }
}
