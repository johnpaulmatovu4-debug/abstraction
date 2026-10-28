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
}
