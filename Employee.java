public class Employee {
    private static int mostRecentEmployeeID = 99;
    private String firstName;
    private String lastName;
    private int employeeID;
    private static int totalEmployeesCreated = 0;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        employeeID = mostRecentEmployeeID + 1;
        mostRecentEmployeeID = employeeID;
        totalEmployeesCreated++;
    }
    
    public String getFullName() {
        return firstName + " " + lastName;
    }
    public int getID() {
        return employeeID;
    }
    public static int getMostRecentEmployeeID() {
        return mostRecentEmployeeID;
    }
    public static int getTotalEmployeesCreated() {
        return totalEmployeesCreated;
    }
    public String employeeInfo() {
        String str = "";
        str += "--------------------------";
        str += "\nEmployee full name: " + firstName + " " + lastName;
        str += "\nEmployee ID: " + employeeID;
        str += "\nMost recent ID assigned: " + mostRecentEmployeeID;
        str += "\nTotal employees hired: " + totalEmployeesCreated;
        str += "\n--------------------------";
        return str;
    }
}
