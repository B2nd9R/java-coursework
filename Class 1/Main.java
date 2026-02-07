public class Main {
    public static void main(String[] args) {
        int mark;
        mark = 85; // Example mark

        if (mark <= 100 && mark >= 90) {
            System.out.println("Grade A");
        } else if (mark < 90 && mark >= 80) {
            System.out.println("Grade B");
        } else if (mark < 80 && mark >= 70) {
            System.out.println("Grade C");
        } else if (mark < 70 && mark >= 60) {
            System.out.println("Grade D");
        } else if (mark < 60 && mark >= 1) {
            System.out.println("Grade F");
        } else {
            System.out.println("Please enter a valid mark from 1 to 100.");
        }
    }
}