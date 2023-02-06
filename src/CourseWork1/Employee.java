package CourseWork1;

public class Employee {
    private String fio;
    private int department;
    private double salary;
    static int counter;
    private int id;

    public Employee(String fio, int department, double salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        id = counter++;

    }

    public String getFio() {
        return this.fio;

    }

    public int getDepartment() {

        return this.department;
    }

    public double getSalary() {

        return this.salary;
    }

    public int getId() {

        return this.id;
    }

    public void setDepartment(int department) {

        this.department = department;
    }

    public void setSalary(double salary) {

        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fio='" + fio + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("    ", 1, 15000);
        employee[1] = new Employee("    ", 2, 20000);
        employee[2] = new Employee("    ", 3, 25000);
        employee[3] = new Employee("    ", 4, 29000);
        employee[4] = new Employee("    ", 5, 29900);
        employee[5] = new Employee("    ", 1, 16000);
        employee[6] = new Employee("    ", 2, 18000);
        employee[7] = new Employee("    ", 3, 21000);
        employee[8] = new Employee("    ", 3, 12000);
        employee[9] = new Employee("    ", 5, 22000);
        for (Employee e : employee) {
            System.out.println(e);

            System.out.println(calculateTheAmountOfSalaryCostsPerMonth(employee));

        }

    }


    public static int calculateTheAmountOfSalaryCostsPerMonth(Employee[] employee) {
        int sum = 0;
        for (Employee e : employee) {
            sum += e.getSalary();
        }

        return sum;
    }


    public static void findAnEmployeeWithTheMinimumWage(Employee[] employee) {
        Employee result = employee[0];
        double minSalary = employee[0].getSalary();
        for (Employee e : employee) {
            if (employee[0] != null) {
                if (e.getSalary() < minSalary) {
                    result = e;
                    minSalary = e.getSalary();


                }

            }
        }


    }

    public static void findTheEmployeeWithTheHighestSalary(Employee[] employee) {
        Employee result = employee[0];
        double maxSalary = employee[0].getSalary();
        for (Employee e : employee) {
            if (e.getSalary() > maxSalary) {
                maxSalary = e.getSalary();
                System.out.println("Сотрудник с мминимальной зп" + result);


            }
        }
    }
}



