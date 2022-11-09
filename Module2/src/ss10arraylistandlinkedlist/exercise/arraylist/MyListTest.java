package ss10arraylistandlinkedlist.exercise.arraylist;


public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>();
        myList.size();
        myList.add(20);
        myList.add(23);
        myList.add(30);
        myList.add(24);
        myList.remove(0);
        myList.add(2, 20);
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("The value to array :" + myList.get(i));
        }
        System.out.println("The Index to array :" + myList.indexOf(30));
        System.out.println("The Contains to array :" + myList.contains(23));
    }
}
