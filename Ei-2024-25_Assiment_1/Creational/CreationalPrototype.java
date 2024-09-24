// Here i am cloning suraj object to surajClone in which his salary is set to 0
// This allows to clone empolyee without knowing there salary
// Image is attached with it please refer that to see the implemented logic
interface Prototype {
    public Prototype clone();
    public void print();
}

class Employee implements Prototype {
    String employeeName;
    int employeeID;
    private float employeeSalary;
    protected String employeeAddress;

    Employee(String employeeName, int employeeID, float employeeSalary, String employeeAddress) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
        this.employeeSalary = employeeSalary;
        this.employeeAddress = employeeAddress;
    }

    @Override
    public Prototype clone() {
        // Cloning but resetting salary to 0, assuming the intention is to not copy salary
        return new Employee(employeeName, employeeID, 0, employeeAddress);
    }

    @Override
    public void print() {
        System.out.println("Name: " + employeeName);
        System.out.println("ID: " + employeeID);
        System.out.println("Salary: " + employeeSalary);
        System.out.println("Address: " + employeeAddress);
    }
}

public class CreationalPrototype {
    public static void main(String[] args) {
        Employee suraj = new Employee("Suraj", 34, 65000, "Bangalore");
        suraj.print();

        Prototype surajClone = suraj.clone();
        surajClone.print();
    }
}

