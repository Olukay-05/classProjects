package stack;

import java.util.Stack;

public class MySongs {

    public static void main(String[] args) {

        Stack<String> mySongs = new Stack<>();

        mySongs.push("I Give You My Heart");
        mySongs.push("Who You Say I Am");
        mySongs.push("Jesus I Need You");
        mySongs.push("So Will I");
        mySongs.push("Broken Vessels");
        mySongs.push("Grace to Grace");
        mySongs.push("The Power Of Your Love");
        mySongs.push("Hossana");
        mySongs.push("In Control");
        mySongs.push("King of Kings");

        System.out.println("Stack: " + mySongs);

        String element = mySongs.pop();
        System.out.println("Removed Element: " + element);

        String song = mySongs.pop();
        System.out.println("Removed Element: " + song);

        String secondSong = mySongs.peek();
        System.out.println("Element at top: " + secondSong);

        int position = mySongs.search("So Will I");
        System.out.println("Position of So Will I: " + position);


        boolean result = mySongs.empty();
        System.out.println("Is the stack empty? " + result);



    }




}
