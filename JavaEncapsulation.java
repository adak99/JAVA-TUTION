///Java Encapsulation

class encapsulation {
    private String name;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
}

public class JavaEncapsulation {
    public static void main(String[] args) {

        encapsulation obj = new encapsulation();

        obj.setName("soumya");

        System.out.println(obj.getName());
    }
}