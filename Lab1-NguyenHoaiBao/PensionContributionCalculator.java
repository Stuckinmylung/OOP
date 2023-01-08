package BaiTap_Buoi1;

import java.util.Scanner;

public class PensionContributionCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int SALARY_CEILING = 6000;
        final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
        final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
        final double EMPLOYEE_RATE_55_TO_60 = 0.13;
        final double EMPLOYER_RATE_55_TO_60 = 0.13;
        final double EMPLOYEE_RATE_60_TO_65 = 0.075;
        final double EMPLOYER_RATE_60_TO_65 = 0.09;
        final double EMPLOYEE_RATE_65_ABOVE = 0.05;
        final double EMPLOYER_RATE_65_ABOVE = 0.075;
        double employeeContribution,employerContribution,totalContribution;
        int salary,age,contributableSalary;

        System.out.print("Enter the monthly salary : ");
        salary = in.nextInt();
        System.out.print("Enter the age : ");
        age = in.nextInt();
        int temp = salary;
        int c = 0;
        while (temp != 0) {
            temp = temp / 10;
            c++;
        }
        int firstDigit = Integer.parseInt(Integer.toString(salary).substring(0, 1));
        contributableSalary = (int)(firstDigit * Math.pow(10,c-1));
        System.out.println(contributableSalary);
        if (age <= 55) {
            employeeContribution = EMPLOYEE_RATE_55_AND_BELOW * contributableSalary;
            employerContribution = EMPLOYER_RATE_55_AND_BELOW * contributableSalary;
        } else if (age > 55 && age <= 60) {
            employeeContribution = EMPLOYEE_RATE_55_TO_60 * contributableSalary;
            employerContribution = EMPLOYER_RATE_55_TO_60 * contributableSalary;
        } else if (age > 60 && age <=65) {
            employeeContribution = EMPLOYEE_RATE_60_TO_65 * contributableSalary;
            employerContribution = EMPLOYER_RATE_60_TO_65 * contributableSalary;
        }
        else {
            employeeContribution = EMPLOYEE_RATE_65_ABOVE*contributableSalary;
            employerContribution = EMPLOYER_RATE_65_ABOVE*contributableSalary;
        }
        totalContribution = employeeContribution + employerContribution;
        System.out.println("The employee's contribution is : " + employeeContribution);
        System.out.println("The employer's contribution is : " + employerContribution);
        System.out.println("The total contribution is : " + totalContribution);
    }
}
