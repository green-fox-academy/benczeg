import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Prints Hello world on terminal
        System.out.println("Hello World!");
        /*
        multi line
        comment
         */
        //Prints Hello me on terminal
        System.out.println("Hello Me!");

        //HumptyDumpty
        System.out.println("Humpty Dumpty sat on a wall,");
        System.out.println("Humpty Dumpty had a great fall.");
        System.out.println("All the king's horses and all the king's men");
        System.out.println("Couldn't put Humpty together again.");

        //HelloOthers

        System.out.println("Hello, Menya!");
        System.out.println("Hello, Máté!");
        System.out.println("Hello, Dani!");

        //PrintValues
        //String
        System.out.println("Hello, World!");
        //int
        System.out.println(42);
        //float csakazertis
        System.out.println(3.141592);

        //Integers
        //positive, negative, zero or null
        System.out.println(42);
        System.out.println(-1);
        System.out.println(0);

        // max and min value
        //an integer is 4 bytes between :

        System.out.println(2147483647);
        System.out.println(-2147483648);

        // I did the overflow, but I was warned and didnt compile

        //Floats
        System.out.println(3.1415);
        System.out.println(-1.5);
        System.out.println(0.0);
        System.out.println(.5);
        System.out.println(5.);

        //Number operations
        //arithmetic operations
        System.out.println(1 + 1);
        System.out.println(5 - 2);
        System.out.println(3 * 4);
        System.out.println(6 / 2);
        System.out.println(5 / 2);
        System.out.println(5. / 2);
        System.out.println(5 / 2.);
        System.out.println(5. / 2.);
        System.out.println(5 % 2);
        System.out.println(8 % 2);

        //Booleans
        //rints true and false
        System.out.println(true);
        System.out.println(false);
        //Boolean operators
        //Negation
        System.out.println(!true); //false
        System.out.println(!false); //true
        //and
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        //or
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);


        //strings and special characters

        System.out.println("apple");
        System.out.println("don't");
        System.out.println("\"Everything you can imagine is real.\" - Picasso");
        // string operators
        System.out.println("tooth" + "brush");
        System.out.println("My favourite number is: " + 24);


        //Introduce yourself
        System.out.println("Bencze Gabor\n25\n1.75");

        //TwoNumbers
        int a = 22;
        int b = 13;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println((double) a / b);
        System.out.println(a / b);
        System.out.println(a % b);

        //CodingHours
        int dailyProgramming = 6;
        int semester = 17;
        int timeSpent = dailyProgramming * semester * 5;
        System.out.println("attendee's working hours in a semester: " + (timeSpent));
        int workHours = 52;
        int timePercentage = timeSpent * 100 / (workHours * semester);
        System.out.println("Percentage spent with programming: " + timePercentage + "%");

        //Variables

        //String
        String welcome = "Hello,World";
        System.out.println(welcome);

        //Boolean
        boolean isAwesome = true;
        System.out.println(isAwesome);

        //Whole number
        int theMeandingOfLife = 42;
        System.out.println(theMeandingOfLife);

        //Floating point number
        //Double (64 bit, double precision IEEE 754)
        double pi = 3.141592;
        System.out.println(pi);

        //Other mentioned types
        byte bt = 2;
        short s = 567;
        long l = 30000000000L;
        float f = 1.3f;
        float f2 = 45f;

        //declaring int
        int number;
        number = 12;
        number = 23;

        a = 12; //már van ilyen változóm, nem hozom létre
        b = 12; //dettó
        a += 4;
        System.out.println(a); //hozzáad 4et
        b -= 4;
        System.out.println(b); //kivon 4et

        int c = 12;
        System.out.println(c++); //kinyomtatja és utána növeli!
        System.out.println(c);

        int d = 12;
        System.out.println(++d); //előbb növeli!
        System.out.println(d);


        //..works with the other as well
        int g = 12;
        g *= 3;
        System.out.println(g);

        //favouriteNumber
        int favouriteNumber = 24;
        System.out.println("My favourite number is " + favouriteNumber);

        //swap
        int swap1 = 123;
        int swap2 = 526;
        a = swap1;
        swap1 = swap2;
        swap2 = a;
        System.out.println(swap1);
        System.out.println(swap2);

        //BMI
        double massInKg = 81.2;
        double heightInM = 1.78;
        double BMI = massInKg / (heightInM * heightInM);
        System.out.println("BMI: " + BMI); //több mint 25 :S

        //DefineBasicInfo
        String myName = "BG";
        int myAge = 25;
        double myHeight = 1.76;
        boolean amIMarried = false;
        System.out.println(myName);
        System.out.println(myAge);
        System.out.println(myHeight);
        System.out.println(amIMarried);

        //VariableMutation
        a = 3;
        a += 10;
        System.out.println(a);

        b = 100;
        b -= 7;
        System.out.println(b);

        c = 44;
        c *= c;
        System.out.println(c);

        d = 125;
        d /= 5;
        System.out.println(d);

        int e = 8;
        e *= e * e;
        System.out.println(e);

        int f3 = 123;
        int f4 = 345;
        boolean fbigger = (f3 > f4);
        System.out.println(fbigger);

        int g1 = 250;
        int g2 = 300;
        boolean gbigger = (g1 < g2 * g2);
        System.out.println(gbigger);

        int h = 135798745;
        boolean hdivisor = (h % 11 == 0);
        System.out.println(hdivisor);

        int i1 = 10;
        int i2 = 3;
        boolean iHigherAndSmaller = (i1 > i2 * i2 && i1 < i2 * i2 * i2);
        System.out.println(iHigherAndSmaller);

        int j = 1521;
        boolean jDividable = (j % 3 == 0 || j % 5 == 0);
        System.out.println(jDividable);

        //SeconsInADay

        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int secondsPerDay = (24 * 60 * 60);
        int remainingSeconds = (secondsPerDay - (currentHours * 3600 + currentMinutes * 60 + currentSeconds));
        System.out.println(remainingSeconds);

        //User input! Scanner

        Scanner scanner = new Scanner(System.in); //Create scanner after added import on top
        String userInput1 = scanner.nextLine();
        System.out.println(userInput1);
        int userInput2 = scanner.nextInt();
        System.out.println(userInput2);

        //HelloUser

        System.out.println("Your name?");
        String userName = scanner.next(); //nextLine nem műxik
        System.out.println("Hello, " + userName + "!");





    }
}
