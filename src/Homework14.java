import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
import java.lang.String;

public class Homework14 {

    static int counter = 0;

    public static void main(String[] args) {

        Scanner keyboard1 = new Scanner(System.in);
        int [] scores = new int[25];
        String [] students = new String[25];
        int gradeA = 0,
                gradeB = 0,
                gradeC = 0,
                gradeD = 0,
                gradeF = 0;

        for (int x = 0; x < 25; x++) {
            int randomGr = ThreadLocalRandom.current().nextInt(50, 101);
            scores[x] = randomGr;
            students[x] = "Student " + (x + 1);

            if ((randomGr >= 90) && (randomGr <= 100)) {
                gradeA++;
                counter++;
            } else if ((randomGr >= 80) && (randomGr <= 89)) {
                gradeB++;
                counter++;
            } else if ((randomGr >= 70) && (randomGr <= 79)) {
                gradeC++;
                counter++;
            } else if ((randomGr >= 60) && (randomGr <= 69)) {
                gradeD++;
                counter++;
            } else {
                gradeF++;
                counter++;
            }
        }
        System.out.println("Number of students with letter grade A: " + gradeA);
        System.out.println("Number of students with letter grade B: " + gradeB);
        System.out.println("Number of students with letter grade C: " + gradeC);
        System.out.println("Number of students with letter grade D: " + gradeD);
        System.out.println("Number of students with letter grade F: " + gradeF);
        System.out.println("The total number of grades is:  " + counter);
        System.out.println();

        System.out.println("Do you want to view the actual scores? Y/N");
        String answer = keyboard1.nextLine();

        if((answer.equals("Y")) || (answer.equals("Yes")) || (answer.equals("yes")) || (answer.equals("yes"))) {
            for (int y = 0; y < 25; y++) {
                System.out.println(students[y] + " random grade is: " + scores[y]);
            }
            System.out.println("Thank you for checking :)");
        }
        else
            System.out.println("Thank you, the program has ended");




    }
}


