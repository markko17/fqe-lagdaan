/****************************************************************
 *
 *  Unit Tests for https://kulotsystems.com/fqe-java
 *
 *  Rename this class and file to FirstQuarter(YourLastname)Test
 *      example:
 *          class: FirstQuarterBabolTest
 *          file : FirstQuarterBabolTest.java
 *
 *  Then update callMainMethod() on top of this class
 *
 *      example:
 *          // helper: call main method
 *          void callMainMethod() {
 *             FirstQuarterBabol.main(null);
 *         }
 *
 ***************************************************************/

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


class FirstQuarterLagdaanTest {


    // helper: call main method
    public void callMainMethod() {
        FirstQuarterLagdaan.main(null);
    }


    // helper: generate user input
    public String generateUserInput(String person1, int year1, int age1, String person2, int year2, int age2) {
        return String.format(
                "%s%s%d%s%d%s%s%s%d%s%d",
                person1,
                System.lineSeparator(),
                year1,
                System.lineSeparator(),
                age1,
                System.lineSeparator(),
                person2,
                System.lineSeparator(),
                year2,
                System.lineSeparator(),
                age2
        );
    }


    @Test
    @org.junit.jupiter.api.Test
    public void testCase1_Person1Is5YearsOlderThanPerson2() {
        // person 1
        String person1 = "Juan";
        int year1 = 1990;
        int age1  = 20;


        // person 2
        String person2 = "Pedro";
        int year2 = 1995;
        int age2  = 20;


        // generate user input
        String userInput = generateUserInput(person1, year1, age1, person2, year2, age2);


        // set input stream
        ByteArrayInputStream inputStream = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(inputStream);


        // set output stream
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);


        // call the main method
        callMainMethod();


        // set expected output
        String expected = person1 + " is 5 year(s) older than " + person2 + ".";


        // get actual output
        String[] lines = outputStream.toString().trim().split(System.lineSeparator());
        String actual = lines[lines.length-1];


        // checkout output
        assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    @Test
    public void testCase2_Person2Is12YearsOlderThanPerson1() {
        // person 1
        String person1 = "Layla";
        int year1 = 2005;
        int age1  = 3;


        // person 2
        String person2 = "Miya";
        int year2 = 2000;
        int age2  = 10;


        // generate user input
        String userInput = generateUserInput(person1, year1, age1, person2, year2, age2);


        // set input stream
        ByteArrayInputStream inputStream = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(inputStream);


        // set output stream
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);


        // call the main method
        callMainMethod();


        // set expected output
        String expected = person2 + " is 12 year(s) older than " + person1 + ".";


        // get actual output
        String[] lines = outputStream.toString().trim().split(System.lineSeparator());
        String actual = lines[lines.length-1];


        // checkout output
        assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    @Test
    public void testCase3_Person1AndPerson2AreOfTheSameAge() {
        // person 1
        String person1 = "Maria";
        int year1 = 2000;
        int age1  = 30;


        // person 2
        String person2 = "Clara";
        int year2 = 2010;
        int age2  = 40;


        // generate user input
        String userInput = generateUserInput(person1, year1, age1, person2, year2, age2);


        // set input stream
        ByteArrayInputStream inputStream = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(inputStream);


        // set output stream
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);


        // call the main method
        callMainMethod();


        // set expected output
        String expected = person1 + " and " + person2 + " are of the same age.";


        // get actual output
        String[] lines = outputStream.toString().trim().split(System.lineSeparator());
        String actual = lines[lines.length-1];


        // checkout output
        assertEquals(expected, actual);
    }
}