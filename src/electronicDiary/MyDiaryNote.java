package electronicDiary;

import java.time.LocalDateTime;

public class MyDiaryNote {
    private LocalDateTime dateTime;
    private String journal;

    public MyDiaryNote(){

    }

    public MyDiaryNote(LocalDateTime dateTime, String journal) {
        this.dateTime = dateTime;
        this.journal = journal;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }
}

