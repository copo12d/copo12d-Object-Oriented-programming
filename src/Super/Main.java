package Super;

public class Main {
    public static void main(String[] args) {
        //Super = Refers to the parent class (Subclass <- Superclasss)
        //        Used in constructors and method overriding
        //        Calls the parent constructor to initialise attributes.
        Person person = new Person("Tom","riddle");
        Student student = new Student("Harry","potter",3.25);
        Employee employee = new Employee("Rubeus","Hagrid",50000);


        person.showName();
        System.out.println(student.gpa);
        student.shoeGPA();
        employee.showSalary();





    }
}
