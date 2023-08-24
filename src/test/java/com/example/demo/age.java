import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your date of birth (YYYY-MM-DD): ");
        String dobInput = scanner.nextLine();
        
        LocalDate dob = LocalDate.parse(dobInput);
        LocalDate currentDate = LocalDate.now();
        
        Period age = Period.between(dob, currentDate);
        
        System.out.println("Your age is: " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days.");
        
        scanner.close();
    }
}
