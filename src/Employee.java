public class Employee {
    private String  Name;
    private String position;
    private String email;
    private String phone;
    private int age;

    public Employee(String Name, String position, String email, String phone, int age) {
        this.Name = Name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age + '}';
    }
}

