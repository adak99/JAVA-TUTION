class childClass { // Single Iheritation in Java

    String firstName = "Soumyadip";
}

class parentClass extends childClass {

    String surName = " Adak";
}

public class javaSingleInheritance {
    public static void main(String[] args) {

        parentClass obj = new parentClass();

        System.out.println("First Name:- " + obj.firstName);
        System.out.println("Sur Name:- " + obj.surName);
    }
}