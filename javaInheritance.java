class emplyee {
    float salary = 40000;
}

public class javaInheritance extends emplyee {

    int bounce = 10000;

    public static void main(String[] args) {

        javaInheritance obj = new javaInheritance();

        System.out.println("Employee salary:- " + obj.salary);
        System.out.println("Employee salary bounce:- " + obj.bounce);
    }
}