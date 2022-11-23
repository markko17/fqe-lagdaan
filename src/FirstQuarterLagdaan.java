import java.util.*;

public class FirstQuarterLagdaan {
    public static void main(String[] args) {
        String name1, name2;
        int year1, year2, age1, age2;

        System.out.println("AGE COMPARATOR");
        System.out.println("Programmed by Andreigh Joshua Espino");
        System.out.println("===============================================");

        Scanner input = new Scanner(System.in);
        System.out.println("PERSON 1");
        System.out.println("  Name: ");
        name1 = input.nextLine();
        System.out.println("  Year: ");
        year1 = Integer.parseInt(input.nextLine());
        System.out.println("  Age: ");
        age1 = Integer.parseInt(input.nextLine());

        year1 = year1 - age1;

        System.out.println("\n");

        System.out.println("PERSON 2\n  Name: ");
        name2 = input.nextLine();
        System.out.println("  Year: ");
        year2 = Integer.parseInt(input.nextLine());
        System.out.println("  Age: ");
        age2 = Integer.parseInt(input.nextLine());

        year2 = year2 - age2;

        System.out.println("\n");

        System.out.println("===============================================");

        if(year1 > year2){
            System.out.println(name2 + " is " + (year1-year2) + " year(s) older than "+name1 + ".");
        }else if(year1 < year2){
            System.out.println(name1 + " is " + (year2-year1) + " year(s) older than "+name2 + ".");
        }else{
            System.out.println(name1 + " and " + name2 + " are of the same age.") ;
        }
    }
}
