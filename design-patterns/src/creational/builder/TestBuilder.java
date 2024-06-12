package creational.builder;

public class TestBuilder {

    public static void main(String[] args) {
        //create an object with optional parameter
        Employee employee = new Employee
                            .EmployeeBuilder("sakshi","ABC")
                            .setAge(26)
                            .setAddress("dehardun")
                            .build();

        System.out.println(employee);

        //create an object without an optional parameter
        Employee employee1 = new Employee
                .EmployeeBuilder("sakshi","ABC")
                .build();

        System.out.println(employee1);
    }
}
