public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax = 0;
    double bonus = 0;
    double riseSalary;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public void tax() {
        if (salary >= 1000) {
            tax = salary * 3 / 100;
        }
    }

    public void bonus() {
        if (workHours >= 40) {
            bonus = (workHours-40) * 30;
        }
    }

    public void riseSalary() {
        if (2021 - hireYear < 10) {
            riseSalary = salary * 5 / 100;
        } else if (2021 - hireYear < 20) {
            riseSalary = salary * 10 / 100;
        } else {
            riseSalary = salary * 15 / 100;
        }
    }

    public void showInfo() {
        System.out.println("name:\t" + name);
        System.out.println("salary:\t" + salary);
        System.out.println("work hours:\t" + workHours);
        System.out.println("hire year:\t" + hireYear);

        System.out.println("tax:\t" + tax);
        System.out.println("bonus:\t" + bonus);
        System.out.println("rising:\t" + riseSalary);

        System.out.println("tax + bonus + salary:\t" + (salary-tax+bonus));
        System.out.println("total salary:\t" + (salary-tax+bonus+riseSalary));



    }
}
