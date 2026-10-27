package activity2;


public class Main {
    public static void main(String[] args) {

        // 1. Logical AND (&&)
        int age = 20;
        boolean hasValidID = true;

        boolean allowedToEnter = (age >= 18) && hasValidID;

        System.out.println("1. Event Entry:");
        System.out.println("Allowed to enter: " + allowedToEnter);


        // 2. Logical OR (||)
        boolean isWeekend = true;
        boolean isHoliday = false;

        boolean noClasses = isWeekend || isHoliday;

        System.out.println("\n2. Class Schedule:");
        System.out.println("No classes today: " + noClasses);


        // 3. Ternary Operator(): Passed or Failed
        int score = 85;

        String result = (score >= 75) ? "Passed" : "Failed";

        System.out.println("\n3. Student Result:");
        System.out.println("Score: " + score);
        System.out.println("Result: " + result);


        // 4. Ternary Operator(): Larger Number
        int num = 25;
        int num2 = 30;

        int largerNumber = (num > num2) ? num : num2;

        System.out.println("\n4. Larger Number:");
        System.out.println("First number: " + num);
        System.out.println("Second number: " + num2);
        System.out.println("Larger number: " + largerNumber);

    }
}
