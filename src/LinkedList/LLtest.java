package LinkedList;

public class LLtest {
    public static void main(String[] args) {
        Linker mylist = new Linker();
        mylist.insert(3);
        mylist.insert(8);
        mylist.insert(9);
        mylist.list();
        System.out.println();
        mylist.list();
        System.out.println("The length of the list is: "+mylist.len());
    }
}
