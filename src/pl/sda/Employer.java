package pl.sda;

public  class Employer extends Person implements IEmployr {
    String company;


    public Employer(String firstName, String lastName, String company) {
        super(firstName, lastName);
        this.company = company;
    }

    @Override
    public String getCompany() {
        return company;
    }

    public String toString() {
        return"Firs Name: " + this.firstName() + "\n" + "Last Name: " + this.lastName() + "\n" + "Company: " + this.getCompany();
    }

}
