public class Main {
    public static void main(String[] args) {
        IPerson.greet();
        IPerson forger = new Person("Forger","Anya", 6);
        forger.introduceSelf();
        forger.incrementAge();
        forger.introduceSelf();
    }
}
