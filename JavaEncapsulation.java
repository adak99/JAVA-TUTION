class encapsulation {
    private String name;

    public String getName() {
        return name;
    }

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