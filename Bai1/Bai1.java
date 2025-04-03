package ss25.Bai1;

public class Bai1 {
    public static void main(String[] args) {
        Account a =  Account.getInstance();
        a.setId(1);
        a.setName("A");
        a.setAge(20);

        Account b = Account.getInstance();
//        b.setId(2);
//        b.setName("B");
//        b.setAge(30);
        System.out.println(a.getName());
        System.out.println(b.getName());
    }
}
