public class Employee {
    private String fName;
    private String lName;
    private int salary;
    public Employee(String fName, String lName, int salary){
        this.fName = fName;
        this.lName = lName;
        this.salary = salary;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getSalary() {
        return salary;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", salary=" + salary +
                '}';
    }
    public static void generate(){

    }
}
