package creational.builder;

public class Employee {

    private String name;
    private String company;
    private int age;         //optional parameter
    private String address;  //optional parameter

    private Employee(EmployeeBuilder employeeBuilder){
        name = employeeBuilder.name;
        company = employeeBuilder.company;
        age = employeeBuilder.age;
        address = employeeBuilder.address;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public static class EmployeeBuilder {

        private String name;
        private String company;
        private int age;
        private String address;

          public EmployeeBuilder(String name, String company) {
            this.name = name;
            this.company = company;
        }

        public EmployeeBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public EmployeeBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public Employee build(){
              return new Employee(this);
        }
    }
}
