import java.util.Scanner;

public class Ifelse {
    public static void main(String args[]) {
        int H, E, M, P, C;
        System.out.println("enter your subjecs marks continusly");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Hindi marks");
        H = s.nextInt();
        System.out.println("Enter English marks");
        E = s.nextInt();
        System.out.println("Enter Maths marks");
        M = s.nextInt();
        System.out.println("Enter Physic marks");
        P = s.nextInt();
        System.out.println("Enter Chemistry marks");
        C = s.nextInt();

        int total = (H + E + M + P + C);
        float percentage = total / 5;

        System.out.println("yout total marks is " + total + "/5 = " + percentage);

        if (percentage < 40) {
            System.out.println("Bete fail hai tu 😟");
        } else if (percentage >= 40 && percentage < 60) {
            System.out.println("2nd divison pass ho haya just chill 🍾");
        }
        else if(percentage>=6 && percentage<75){
            System.out.println(" first division just chill 🍾");
        }
        else
        {
            System.out.println("You are a topper Dj bajva de ab to Haramkhor😛 ");
        }
    }
}
