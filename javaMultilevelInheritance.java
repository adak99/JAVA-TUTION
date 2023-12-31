
class chidocupation { // Multilevel Inheritance in Java

    String ocupation = "Student";
}

class child extends chidocupation {

    String firstName = "Soumyadip";
}

class parent extends child {

    String surName = "Adak";

}

public class javaMultilevelInheritance {
    public static void main(String[] args) {

        parent obj = new parent();

        System.out.println("Ocupation:- " + obj.ocupation);
        System.out.println("First Name:- " + obj.firstName);
        System.err.println("Sur Name:- " + obj.surName);
    }
}
