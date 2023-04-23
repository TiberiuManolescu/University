package university;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.Set;
import java.util.TreeSet;

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
        Employee employee1 = new Employee(453353, "Vlad", "Popescu", 3000);
        Employee employee2 = new Employee(445651, "Andrei", "Ionica", 5000);

        employee1.raiseSalary(30);
        employee2.raiseSalary(50);

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());

        //Account_lab2
        Account account1 = new Account("415151", "Victor");
        Account account2 = new Account("415345", "Vlad");

        account1.credit(100);
        account2.debit(3);
        account1.transferTo(account2, 5);

        System.out.println(account1.toString());
        System.out.println(account2.toString());

        //Rectangle2_lab3
        Rectangle2 rectangle2 = new Rectangle2(1.0, 1.0, "white", false);

        System.out.println(rectangle2.toString());

        //Circle2_lab3
        Circle2 circle2 = new Circle2(3, "red", true);

        System.out.println(circle2.toString());

        //shape_lab3
        Shape shape = new Shape("red", true);

        System.out.println(shape.toString());

        //Square_lab3
        Square square = new Square(1.0, "blue", false);

        System.out.println(square.toString());

        //Author_lab4
        Author author1 = new Author("Jakson", "jakson@gmail.com", 'm');
        Book1 book1 = new Book1(author1.toString(), 87.7, 6);

        Author author2 = new Author("H.Marela", "marela@gmail.com", 'f');
        Book2 book2 = new Book2("H.Marela", 68.5, 9);

        System.out.println(author1.toString());
        System.out.println(book1.toString());

        System.out.println(author2.toString());
        System.out.println(book2.toString());

        //MyPoint_lab4

        MyPoint[] points = new MyPoint[10];

        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i + 1, i + 1);
        }

        for (MyPoint point : points) {
            System.out.println("Distance (0,0) for point " + point.toString() + " is: " + point.distance(0, 0));
        }

        MyPoint point1 = new MyPoint(1, 1);
        MyPoint point2 = new MyPoint(3, 7);

        System.out.println("Distance " + point1.toString() + "and" + point2.toString() + "is: " + point1.distance(point2));
        System.out.println("Distance " + point1.toString() + "and" + point2.toString() + "is: " + point1.distance(3, 7));


        //MyCircle_lab4
        MyCircle circle_1 = new MyCircle(0, 0, 3);
        MyCircle circle_2 = new MyCircle(5, 5, 2);

        double distance = circle_1.distance(circle_2);

        System.out.println("The distance between circle1 and circle2 is: " + String.format("%f", distance));


        //MyTriangle
        MyTriangle triangle = new MyTriangle(2, 3, 4, 5, 6, 7);


        double perimeter = triangle.getPerimeter();

        String type = triangle.getType();

        System.out.println("Triangle 1:");
        System.out.println("Perimeter: " + String.format("%f", perimeter));
        System.out.println("Type: " + type);


        //GenericStack_lab5
        GenericStack<Integer> intStack = new GenericStack<>(10);
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        System.out.println("Top element: " + intStack.peek());
        System.out.println("Popped element: " + intStack.pop());
        System.out.println("Is stack empty? " + intStack.isEmpty());
        System.out.println("Is stack full? " + intStack.isFull());

        GenericStack<Double> doubleStack = new GenericStack<>(5);
        doubleStack.push(3.14);
        doubleStack.push(1.23);
        System.out.println("Top element: " + doubleStack.peek());
        System.out.println("Popped element: " + doubleStack.pop());
        System.out.println("Is stack empty? " + doubleStack.isEmpty());
        System.out.println("Is stack full? " + doubleStack.isFull());

        //TreeSet_lab5
        Set<Employee2> employeeSet = new TreeSet<>();
        employeeSet.add(new Employee2(1, "John"));
        employeeSet.add(new Employee2(4, "Carlos"));
        employeeSet.add(new Employee2(2, "Mike"));
        employeeSet.add(new Employee2(3, "Anna"));

        System.out.println("Employees sorted by id:");
        for (Employee2 e : employeeSet) {
            System.out.println(e);
        }

        Set<Employee2> employeeSetByName = new TreeSet<>(new EmployeeNameComparator());
        employeeSetByName.addAll(employeeSet);
        System.out.println("Employees sorted by name:");
        for (Employee2 e : employeeSetByName) {
            System.out.println(e);
        }

        employeeSet.removeIf(e -> e.getName().equals("Carlos"));
        System.out.println("Employees after removing Carlos:");
        for (Employee2 e : employeeSet) {
            System.out.println(e);

        //Junit_lab6
            Result result = JUnitCore.runClasses(StackTest.class);

            for (Failure failure : ((Result) result).getFailures()) {
                System.out.println(failure.toString());
            }
            System.out.println("Tests passed: " + result.wasSuccessful());

        }
    }
}


