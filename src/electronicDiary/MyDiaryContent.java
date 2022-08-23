package electronicDiary;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class MyDiaryContent {

    private ArrayList<MyDiaryNote> MyDiaryNotes = new ArrayList<>();;

    public void diaryContent() {
        MyDiaryNotes = new ArrayList<>();
    }



    public void addJournal(LocalDateTime dateTime, String journal) {
        MyDiaryNotes.add(new MyDiaryNote(dateTime, journal));
    }

    public static void deleteMyDiaryNotes(LocalDateTime dateTime) {
        System.out.println("Entries with the same exact date and time will be deleted");
        dateTime = readDateTime();
        MyDiaryContent.deleteMyDiaryNotes(dateTime);
    }

    private static LocalDateTime readDateTime() {
        return null;
    }

    public static void printMyDiaryNotes(){
            System.out.println();
            System.out.println();
            System.out.println("Welcome to your virtual diary!");
        DateTimeFormatter dateTimeFormatter = null;
        System.out.println("Today is: " + LocalDateTime.now().format(dateTimeFormatter));
            System.out.println();
            // printing the home screen
            System.out.println("Today:\n------");
            printEntries(LocalDate.now());
            System.out.println();
            System.out.println("Tomorrow:\n---------");
            printEntries(LocalDate.now().plusDays(1));
            System.out.println();
    }

    private static void printEntries(LocalDate now) {

        readDateTime().toLocalDate();
    }


}