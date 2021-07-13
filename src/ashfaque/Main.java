package ashfaque;

import java.util.Scanner;

public class Main {
    /*
    * Name: Md. Ashfaqur Rahman
    * ID: 2012020129
    * Section: C
    * Email: cse_2012020129@lus.ac.bd
    * Date: 13-07-2021
    * */

    public static void main(String[] args) {
        Scanner mySec = new Scanner(System.in);
        System.out.print("Please enter your section: ");
        String section = mySec.nextLine();

        System.out.println("Section is: " + section);

        Info myInfo = new Info();
        Hobby myHobby = new Hobby();
        System.out.println("Name is: " + myInfo.name);
        System.out.println("ID No. is: " + myInfo.id);
        System.out.println("Hobby is: " + myHobby.hobbyName);

    }
}
