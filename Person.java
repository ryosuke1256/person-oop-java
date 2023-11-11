class Person implements IPerson {
    final private String firstName;
    private String lastName;
    private int age;

    public Person(String firsName, String lastName, int age) {
        this.firstName = firsName;
        this.lastName = lastName;
        this.age = age;
    }

    private String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public void incrementAge() {
        this.age++;
    }

    public void introduceSelf() {
        String introText =
                String.format("My name is %s. I am %d years old.", this.getFullName(), this.age);
        System.out.println(introText);
    }
}
