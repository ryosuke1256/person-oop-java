public class Main {
    // main method,
    public static void main(String[] args) {
        User.saySleepy();
        User anya = new User("Anya",6);
        anya.introduceSelf();
        anya.setName("AnyaForger");
        // can not anya.name, because name is private field
        System.out.println(anya.getName());
    }
}
