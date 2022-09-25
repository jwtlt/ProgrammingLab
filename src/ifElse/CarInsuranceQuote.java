package ifElse;

import java.util.Scanner;

public class CarInsuranceQuote {
    public static void main(String[] args) {
    //DO NOT CHANGE
    double premium = 0;
    int accidentsAmount = 0;
    int daysDrivenToWorkOrSchool = 0;
    int milesToWorkOrSchool = 0;
    String vehicleOwnership = "";
    String vehicleUsage = "";
    String continuousInsurance = "";
    String education = "";
    String name = "";
    String referenceNumber = "";

    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to the CountyFarm car insurance!");
    //WRITE YOUR CODE HERE

    System.out.println("Enter your name");
    name = scan.nextLine();

    System.out.println("Do you have a US driver license?");
    String licence = scan.nextLine();

    if(licence.equals("No")){
        System.out.println("Invalid data!");

        System.exit(0);
    }


    System.out.println("Enter your zip code");
    int zipcode = scan.nextInt();

    if(zipcode == 20910 || zipcode  == 20740){
        premium += 60;
    }
    else if(zipcode == 22102 || zipcode == 22103){
        premium += 30;
    }
    else{
        premium += 50;
    }


    System.out.println("Is this vehicle Owned, Financed, or Leased?");
    vehicleOwnership = scan.next();

    if(vehicleOwnership.equals("Owned")){
        premium += 10;
    }
    else{
        premium += 20;
    }


    System.out.println("How is this vehicle primarily used?");
    vehicleUsage = scan.next();

    if(vehicleUsage.equals("Business")){
        premium += 50;
    }
    else if(vehicleUsage.equals("Pleasure")){
        premium += 10;
    }
    else if(vehicleUsage.equals("Commute")){
        premium += 20;

        System.out.println("Days Driven To Work And/Or School");
        daysDrivenToWorkOrSchool = scan.nextInt();

        premium += daysDrivenToWorkOrSchool * 5;

        System.out.println("Miles Driven To Work And/Or School");
        milesToWorkOrSchool = scan.nextInt();

        premium += milesToWorkOrSchool * 1;
    }


    System.out.println("How old are you?");
    int age = scan.nextInt();

    if(age < 16){
        System.out.println("Invalid data!");
        System.exit(0);
    }
    else if(age < 18){
        premium *=20;
    }
    else if(age <= 21){
        premium *= 6;
    }
    else if(age < 25){
        premium *=2;
    }


    System.out.println("How many years you've been driving?");
    int experience = scan.nextInt();

    if(experience > 0 && (age - experience) >= 16){
        premium -= experience*5;
    }
    else{
        System.exit(0);
    }


    System.out.println("Have you had any accidents in the last 5 years?");
    String accident = scan.next();

    if(accident.equals("Yes") || accident.equals("YES")){
        System.out.println("How many?");
        accidentsAmount = scan.nextInt();

        premium += premium*0.2*accidentsAmount;
    }


    System.out.println("Have you had continuous insurance for the past 12 months?");
    continuousInsurance = scan.next();

    if(continuousInsurance.equals("No")){
        premium *= 2;
    }


    scan.nextLine(); //in order to clear Scanner's memory (previous scan.next() dosen't read enter but nextLine() does)


    System.out.println("What is the highest level of education you have completed?");
    education  = scan.nextLine();

    if(education.equals("PhD") || education.equals("Bachelor") || education.equals("Masters")){
        premium -= premium*0.05;
    }
    else if(education.equals("Doctors")){
        premium -= premium*0.1;
    }
    else{
        premium += premium*0.05;
        education = education.replace(" ","");    //******
    }

    String str1 = name.substring(0,2).toUpperCase();
    String str2 = name.substring(name.length()-2).toUpperCase();

    referenceNumber =str1 + age + str2 + zipcode + education.toUpperCase();


    System.out.println(name + ", here's your quote!");
    System.out.println("Start Your Policy Today For: $" + premium);
    System.out.println("Reference number: "  + referenceNumber );

    }
}
