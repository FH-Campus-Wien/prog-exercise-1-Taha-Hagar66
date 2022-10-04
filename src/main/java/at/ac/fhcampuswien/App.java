package at.ac.fhcampuswien;



import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        char a = 'Z';
        int b = 0xface;
        int c = 10;
        long d = 80L;
        double e = 44e-1f;
        float f = 5.5f;
        double g = 8.88e1;
        double h = 99.9;
        int sum;

        int v = (int) d;
        int w = (int) e;
        int x = (int) f;
        int y = (int) g;
        int z = (int) h;

        sum = a+b+c+v+w+x+y+z;
        System.out.println("" +sum);

    }

    //todo Task 4
    public void addTwoNumbers(){
        int num1, num2, sum;
        Scanner sc  = new Scanner(System.in);

        System.out.print("");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        sum = num1 + num2;
        System.out.println("" +sum);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        int x, y, t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Before Swap:");
        System.out.print("x: ");
        x = sc.nextInt();
        System.out.print("y: ");
        y = sc.nextInt();

        /*swapping */
        t = x;
        x = y;
        y = t;
        System.out.println("After Swap:");
        System.out.println("x: "+ x);
        System.out.println("y: " + y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.print("n1: ");
        n1 = sc.nextInt();
        System.out.print("n2: ");
        n2 = sc.nextInt();

        if (n1>n2){
            System.out.println("n1 > n2");
        }else if (n2>n1){
                System.out.println("n2 > n1");
        }else{
            System.out.println("n1 == n2");
        }

    }

    //todo Task 7
    public void ratingSalesPerson(){
        int rev;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter annual Revenue: ");
        rev = sc.nextInt();

        if (rev < 0 || rev >= 100000){
            System.out.println("Invalid Revenue");
        }else if (rev >= 0 && rev < 20000){
            System.out.println("Poor Sales Revenue");
        }else if (rev >= 20000 && rev < 50000){
                System.out.println("Average Sales Revenue");
        }else if (rev >= 50000 && rev < 80000){
            System.out.println("Good Sales Revenue");
        }else if (rev >= 80000 && rev < 100000){
            System.out.println("Excellent Sales Revenue");
        }

    }


    //todo Task 8
    public void getCommissionRate(){
        int x;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter CommissionClass: ");
        x = sc.nextInt();

        switch (x) {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
        }


    }

    //todo Task 9
    public void leapyear(){
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Year: ");
        year = sc.nextInt();

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
            System.out.println("Leapyear");
        }
        else{
            System.out.println("Not a Leapyear");
        }

    }

    //todo Task 10
    public void transposedNumbers(){
        int num, rev, rest;

        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        num = sc.nextInt();

        rev = 0;
        while (num != 0)
        {
            rest = num % 10;

            rev = rev * 10 + rest;
            num /= 10;
        }
        System.out.println ("" + rev);
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}
