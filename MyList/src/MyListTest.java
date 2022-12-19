
public class MyListTest {
    public static void main(String[] args) {
       MyList<String> list = new MyList<>();
       list.add("Không");
       list.add("Phải");
       list.add("Là");
       list.add("Cường");

       print(list.getData());
       list.remove(1);

       print(list.getData());
    }

    static void print(Object[] list) {
        for (Object x : list) {
            if (!(x == null)) {
                System.out.println((String) x);
            }
        }
    }
}