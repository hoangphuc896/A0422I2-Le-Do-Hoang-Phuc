package ss10darraylistvslinklist.exercise;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>(10);
        list.size();
        list.add (12);
        list.add (14);
        list.add (34);
        list.add(11);
        list.add(3,24);
        System.out.println(list.contains(10));
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)+"\t");
        }
    }
}
