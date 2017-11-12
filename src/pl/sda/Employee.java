package pl.sda;

public  class Employee implements IEmployee {
    Employer employer;
    String calcSalary;

    public Employee(Employer employer, String calcSalary) {
        this.employer = employer;
        this.calcSalary = calcSalary;

    }

    @Override
    public Employer getEmployer() {
        return employer;
    }


    @Override
    public String calcSalary() {
        return calcSalary;
    }

}
