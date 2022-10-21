class User implements IUser {
    // fields variables
    private String name;
    // integerType  -2,147,483,648～2,147,483,647(4bite)
    private int age;

    // constructor, same name as class name
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter, getMethodName 
    public String getName() {
        return this.name;
    }

    // setter, setMethodName 
    public void setName(String name) {
        this.name = name;
    }

    // public static method, to call Class.staticMethod()
    public static void saySleepy() {
        System.out.println("I'm sleepy.");
    }

    // public method, to call instance.method()
    public void introduceSelf() {
        System.out.println("My name is " + this.name + " and I am " + this.age + " years old.");
    }
}