package customClass;

public class SalaryCalculator {
    public static void main(String[] args) {

        Salary salary = new Salary();
        salary.setInfo(1000,0.2,10);

        System.out.println(salary);
    }
}
