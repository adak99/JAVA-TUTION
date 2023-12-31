
class chidocupation {

    String ocupation = "Student";
}

class child extends chidocupation {

    String firstName = "Soumyadip";
}

class parent extends chidocupation {

    String surName = "Adak";
}

public class javaHierarchicalInheritance {
    public static void main(String[] args) {

        parent obj = new parent();

        System.out.println("Ocupation:- " + obj.ocupation);
        // System.out.println("First Name:- " + obj.firstName); // Compile time error
        System.err.println("Sur Name:- " + obj.surName);
    }
}
