package ss25.Bai1;

public class Account {
    private static Account instance;
    private int id;
    private String name;
    private int age;

    public Account() {
    }

    public Account(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public static Account getInstance() {
        if (instance == null) {
            instance = new Account();
        }
        return instance;
    }

    public static void setInstance(Account instance) {
        Account.instance = instance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
