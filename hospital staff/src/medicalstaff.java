public abstract class medicalstaff {
    protected String employeeId;
    protected String name;
    protected String department;
    protected int workinghours;

    public medicalstaff(String employeeId, String name, String department, int workinghours) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.workinghours = workinghours;
    }
    public abstract void performDuties();

    public void displayInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Working hours: " + workinghours);
    }
}
