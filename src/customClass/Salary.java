package customClass;

public class Salary {
    public double hourlyRate, stateTaxRate ;
    public int weeklyHours;

    public void setInfo(double hourlyRate, double stateTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary(){

       double salary = hourlyRate * weeklyHours * 52 ;

       return salary;
    }

    public double stateTaxRate(){
        double stateTaxRate ;
        if(salary()<100_000) {
            stateTaxRate = 0.2;
        }
        else {
            stateTaxRate = 0.25;
        }
        return stateTaxRate;
    }

    public double salaryAfterTax(){
        double salaryAfterTax;

        salaryAfterTax = salary() - salary() * stateTaxRate();

        return salaryAfterTax;
    }

    public String toString() {
        return "SalaryCalculator{" +
                "salary=" + salary() +
                "hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", weeklyHours=" + weeklyHours +
                ", salaryAfterTax=$" + salaryAfterTax() +
                '}';
    }
}
