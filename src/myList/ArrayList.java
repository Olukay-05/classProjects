package myList;

public class ArrayList implements List{


    private boolean isEmpty= true;
    private int count;
    private String[] elements = new String [5];

    @Override
    public void add(String item) {
        isEmpty = false;
        elements[count] = item;
        count++;
    }

    @Override
    public void remove(int id) {
        elements[id] = null;
        count--;
    }

    @Override
    public void remove(String item) {

    }

    @Override
    public String get(int id) {
        return elements[count];
    }

    @Override
    public void add(int id,String item) {

    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public boolean contains(String anotherItem) {
        return true;
    }
}
