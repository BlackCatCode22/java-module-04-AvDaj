// aV 10/1/24
//
//

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;


public class TodaysDate {
    public static void main(String[] args) throws IOException {
        System.out.println("\nWelcome to dates and animal birthdays!\n");

        Date today = new Date();

        //
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatterYear = new SimpleDateFormat("yyyy");

        // Format the date and store it in a string
        String strTodaysDate = formatter.format(today);
        String strTodaysYear = formatterYear.format(today);

        // Output results
        System.out.println("Today's date in the format yyy-MM-dd: " + strTodaysDate);

        // Calculate birthdates for the following two hyenas
        // 1. 4 year old female hyena, born in spring, tan color, 70 pounds, from Friguia Park, Tunisia
        // 2. 12 year old male hyena, born in fall, brown color, 150 pounds, from Friguia Park, Tunisia

        // Write Java code to calculate birthdates for the animal and then create a method that
        // returns a string for the animal's birthdate.

        // input: "4 year old female hyena, born in spring"
        // processing: find the age and birth season
        //             and then use decision control structure to
        //             calculate the date.

        // parse the String first
        String strStarting = "4 year old female hyena, born in spring, tan color, 70 pounds, from Friguia Park, Tunisia";
        // split the string on ", "
        String[] arrayOfStringsOnComma = strStarting.split(", ");
        // output the array elements
        // this is a for : each loop - very handy when examining array elements
        System.out.println();
        for (String s : arrayOfStringsOnComma){
            System.out.println("element of the string is: " + s);
        }
        System.out.println();
        String[] arrayOfStrPartsOnSpace = arrayOfStringsOnComma[0].split(" ");
        for (String s : arrayOfStrPartsOnSpace) {
            System.out.println("element of the string is: " + s);
        }
        System.out.println();
        String[] arrayOfStrPartsOnSpace02 = arrayOfStringsOnComma[1].split(" ");
        for (String s : arrayOfStrPartsOnSpace02) {
            System.out.println("element of the string is: " + s);
        }
        System.out.println();
        String ageInYears = arrayOfStrPartsOnSpace[0];
        String animalBirthSeason = arrayOfStrPartsOnSpace02[2];
        System.out.println("The age in years of the animal is: " + ageInYears);
        System.out.println("The season of birth the animal is: " + animalBirthSeason);

        String animalBirthdates = "";
        int todaysYear = Integer.parseInt(strTodaysYear);
        int animalBirthYear = todaysYear - Integer.parseInt(ageInYears);

        if (animalBirthSeason.contains("spring")) {
            animalBirthdates = Integer.toString(animalBirthYear) + "-03-21";
        }
        if (animalBirthSeason.contains("summer")) {
            animalBirthdates = Integer.toString(animalBirthYear) + "-06-21";
        }
        if (animalBirthSeason.contains("fall")) {
            animalBirthdates = Integer.toString(animalBirthYear) + "-09-21";
        }
        if (animalBirthSeason.contains("winter")) {
            animalBirthdates = Integer.toString(animalBirthYear) + "-12-21";
        }

        System.out.println("\nanimalBirthdate = " + animalBirthdates);
    }
}