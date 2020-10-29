class Person{
    public int id;
    public String name;

    public Person(int id, String name) {
        this.id = id;
        this.name =name;
    }
}

public class PersonBuilder {

    private static Person buildPersion(int id, String name) {
        return  new Person(id, name);
    }

    public static void main(String[] args) {
        int id = 123;
        String name = "Tom";
        Person person = null;
        person = buildPersion(id, name);


        System.out.println(person.id);
    }
}
