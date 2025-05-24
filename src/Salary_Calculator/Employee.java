package Salary_Calculator;

public class Employee {
    String name;
    private double salary;
    int workHours ;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        double income_tax = 0;
        if(this.salary <= 1000){
            income_tax = 0;
        } else {
            income_tax = this.salary * 0.03;
        }
        return income_tax;
    }

    public double bonus(){
        double bonus_payment = 0;

        if(this.workHours >= 40){
            bonus_payment = (this.workHours - 40) * 30;
        }
        return bonus_payment;
    }

    public double raiseSalary(){
        int currentYear = 2021;
        int yearsWorked = currentYear - this.hireYear;
        double raise_amount = 0;

        if (yearsWorked > 19) {
            raise_amount = this.salary * 0.15;
        } else if (yearsWorked > 9) {
            raise_amount = this.salary * 0.10;
        } else {
            raise_amount = this.salary * 0.05;
        }
        return raise_amount;
    }

    @Override
    public String toString(){
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();

        double totalSalary = this.salary + bonus - tax;
        double totalSalaryWithRaise = this.salary + raise;

        return "Adı : " + this.name +
                "\nMaaşı : " + this.salary +
                "\nÇalışma Saati : " + this.workHours +
                "\nBaşlangıç Yılı : " + this.hireYear +
                "\nVergi : " + tax +
                "\nBonus : " + bonus +
                "\nMaaş Artışı : " + raise +
                "\nVergi ve Bonuslar ile birlikte maaş : " + totalSalary +
                "\nToplam Maaş : " + totalSalaryWithRaise;
    }
}
