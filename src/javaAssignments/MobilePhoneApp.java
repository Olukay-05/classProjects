package javaAssignments;


import java.util.Scanner;

public class MobilePhoneApp {


    private static Scanner scanner = new Scanner(System.in);
    private static int input;

    public static void main(String[] args) {
        menu();
        callRegisterOptions();
        settingsOptions();

    }

    public static void menu() {

        System.out.print("""
                Press\s
                  1  Phone book
                  2  Messages
                  3  Chat
                  4  Call register
                  5  Tones
                  6  Settings
                  7  Call divert
                  8  Games
                  9  Calculator
                  10  Remainder
                  11  Check
                  12  Profile
                  13  SIM services\s""");
        userInput();
        switch (input) {
            case 1:
                phoneBook();
                break;
            case 2:
                messages();
                break;
            case 3:
                chat();
                break;
            case 4:
                callRegister();
                break;
            case 5:
                tones();
                break;
            case 6:
                settings();
                break;
            case 7:
                callDivert();
                break;
            case 8:
                games();
                break;
            case 9:
                calculator();
                break;
            case 10:
                reminders();
            case 11:
                clock();
            case 12:
                profiles();
            case 13:
                simServices();
            default:
                System.out.println("wrong input");
        }
    }


    public static void phoneBook() {

        System.out.print("""
                                
                Press\s
                1   Search
                2   Service Nos.
                3   Add name
                4   Erase
                5   Edit
                6   Assign tone
                7   Send b'card
                8   Options
                9   Speed dials
                10  Voice tags\s""");
        userInput();
        switch (input) {

            case 1:
                System.out.println("Search");
                break;
            case 2:
                System.out.println("Service Nos.");
                break;
            case 3:
                System.out.println("Add name");
                break;
            case 4:
                System.out.println("Erase");
                break;
            case 5:
                System.out.println("Edit");
                break;
            case 6:
                System.out.println("Assign tone");
                break;
            case 7:
                System.out.println("Send b'card");
                break;
            case 8:
                System.out.println("Options");
                phonebookOption8();
                break;
            case 9:
                System.out.println("Speed dial");
                break;
            case 10:
                System.out.println("Voice tags");
                break;
            default:
                phoneBook();
        }

    }


    public static void phonebookOption8(){
        System.out.printf("1. Type of view%n2. Memory status%n");
        userInput();
        switch (input){
            case 1:
                System.out.println("Type of view");
                break;
            case 2:
                System.out.println("Memory status");
                break;
        }
    }


    public static void callRegisterOptions(){

        callRegisterOption5();
        callRegisterOption6();
        callRegisterOption7();
    }

    public static void settingsOptions(){
        settingsOption1();
        settingsOption2();
        settingsOption3();
    }


    public static void callRegisterOption5(){

        System.out.printf("1. Last call duration%n2. All calls' duration%n3. Received calls' duration%n4. Dialled calls' duration%n5. Clear timers");
        userInput();
        switch (input){
            case 1:
                System.out.println("Last call duration");
                break;
            case 2:
                System.out.println("All calls' duration");
                break;
            case 3:
                System.out.println("Received calls' duration");
                break;
            case 4:
                System.out.println("Dialled calls' duration");
                break;
            case 5:
                System.out.println("Clear timers");
                break;

        }
    }
    public static void callRegisterOption6(){

        System.out.printf("1. Last call cost%n2. All calls' cost%n3. Clear counters%n");
        userInput();
        switch (input){
            case 1:
                System.out.println("Last call cost");
                break;
            case 2:
                System.out.println("All calls' cost");
                break;
            case 3:
                System.out.println("Clear counters");
                break;
        }
    }
    public static void callRegisterOption7(){

        System.out.printf("1. Call cost limit%n2. Show costs in%n");
        userInput();
        switch (input){
            case 1:
                System.out.println("Call cost limit");
                break;
            case 2:
                System.out.println("Show costs in");
                break;
        }
    }

    public static void settingsOption1(){

        System.out.printf("1. Automatic redial%n2. Speed dialling%n3. Call waiting options%n4. Own number sending%n5. Phone line in use%n6. Automatic answer%n");
        userInput();
        switch (input){
            case 1:
                System.out.println("Automatic redial");
                break;
            case 2:
                System.out.println("Speed dialling");
                break;
            case 3:
                System.out.println("Call waiting options");
                break;
            case 4:
                System.out.println("Own number sending");
                break;
            case 5:
                System.out.println("Phone line in use");
                break;
            case 6:
                System.out.println("Automatic answer");
                break;

        }

    }
    public static void settingsOption2(){

        System.out.printf("1. Language%n2. Cell info display%n3. Welcome note%n4. Network selection%n5. Lights%n6. Confirm SIM service actions%n");
        userInput();
        switch (input){
            case 1:
                System.out.println("Language");
                break;
            case 2:
                System.out.println("Cell info display");
                break;
            case 3:
                System.out.println("Welcome note");
                break;
            case 4:
                System.out.println("Network selection");
                break;
            case 5:
                System.out.println("Lights");
                break;
            case 6:
                System.out.println("Confirm SIM service actions");
                break;

        }
    }
    public static void settingsOption3(){

        System.out.printf("1. PIN code request%n2. Call barring service%n3. Fixed dialling%n4. Closed user group%n5. Phone security%n6. Change access codes%n");
        userInput();
        switch (input){
            case 1:
                System.out.println("PIN code request");
                break;
            case 2:
                System.out.println("Call barring service");
                break;
            case 3:
                System.out.println("Fixed dialling");
                break;
            case 4:
                System.out.println("Closed user group");
                break;
            case 5:
                System.out.println("Phone security");
                break;
            case 6:
                System.out.println("Change access codes");
                break;

        }

    }


    public static void userInput(){
        System.out.print("\nSelect an option: ");
        input = scanner.nextInt();
    }

    public static void messages() {
        System.out.println("""
                Press\s
                1   Write messages
                2   Inbox
                3   Outbox
                4   Picture messages
                5   Templates
                6   Smileys
                7   Message settings
                8   Info service
                9   Voice mailbox number
                10  Service command editor\s""");

        userInput();
        switch (input) {

            case 1:
                System.out.println("Write messages");
                break;
            case 2:
                System.out.println("Inbox");
                break;
            case 3:
                System.out.println("Outbox");
                break;
            case 4:
                System.out.println("Picture messages");
                break;
            case 5:
                System.out.println("Templates");
                break;
            case 6:
                System.out.println("Smiley");
                break;
            case 7:
                System.out.println("Message settings");
                break;
            case 8:
                System.out.println("Info service");
                break;
            case 9:
                System.out.println("Voice mailbox number");
                break;
            case 10:
                System.out.println("Service command editor");
                break;
            default:
                messages();
        }
    }

    public static void chat(){

        System.out.println("Chat");
        userInput();
    }

    public static void callRegister() {
            System.out.println("""
                    Press\s
                    1   Missed calls
                    2   Received calls
                    3   Dialled numbers
                    4   Erase recent call lists
                    5   Show call duration
                    6   Show call costs
                    7   Call cost settings
                    8   Prepaid credit\s""");

            userInput();
            switch (input) {

                case 1:
                    System.out.println("Missed calls");
                    break;
                case 2:
                    System.out.println("Received calls");
                    break;
                case 3:
                    System.out.println("Dialled numbers");
                    break;
                case 4:
                    System.out.println("Erase recent call lists");
                    break;
                case 5:
                    System.out.println("Show call duration");
                    callRegisterOption5();
                    break;
                case 6:
                    System.out.println("Show call cost");
                    callRegisterOption6();
                    break;
                case 7:
                    System.out.println("Call cost setting");
                    callRegisterOption7();
                    break;
                case 8:
                    System.out.println("Prepaid credit");
                    break;
                default:
                    callRegister();
            }
    }


    public static void tones() {
        System.out.println("""
                Press\s
                1   Ringing tone
                2   Ringing volumes
                3   Incoming call alert
                4   Composer
                5   Message alert tone
                6   Keypad tones
                7   Warning and game tones
                8   Vibrating alert
                9   Screen saver\s""");

        userInput();
        switch (input) {

            case 1:
                System.out.println("Ringing tone");
                break;
            case 2:
                System.out.println("Ringing volumes");
                break;
            case 3:
                System.out.println("Incoming call alert");
                break;
            case 4:
                System.out.println("Composer");
                break;
            case 5:
                System.out.println("Message alert tone");
                break;
            case 6:
                System.out.println("Keypad tones");
                break;
            case 7:
                System.out.println("Warning and game tones");
                break;
            case 8:
                System.out.println("Vibrating alert");
                break;
            case 9:
                System.out.println("Screen saver");
                break;
            default:
                tones();
        }
    }

    public static void settings() {
        System.out.println("""
                Press\s
                1   Call settings
                2   Phone settings
                3   Security settings
                4   Restore factory settings\s""");

        userInput();
        switch (input) {

            case 1:
                System.out.println("Call settings");
                settingsOption1();
                break;
            case 2:
                System.out.println("Phone settings");
                settingsOption2();
                break;
            case 3:
                System.out.println("Security settings");
                settingsOption3();
                break;
            case 4:
                System.out.println("Restore factory settings");
                break;
            default:
                settings();
        }
    }


    public static void callDivert(){

        System.out.println("Call divert");
        userInput();
    }

    public static void games(){

        System.out.println("Games");
        userInput();
    }

    public static void calculator(){

        System.out.println("Calculator");
        userInput();
    }

    public static void reminders(){

        System.out.println("Reminders");
        userInput();
    }


    public static void clock() {
        System.out.println("""
                Press\s
                1   Alarm clock
                2   Clock settings
                3   Date settings
                4   Stopwatch
                5   Countdown timer
                6   Auto update of date and time\s""");

        userInput();
        switch (input) {

            case 1:
                System.out.println("Alarm clock");
                break;
            case 2:
                System.out.println("Clock settings");
                break;
            case 3:
                System.out.println("Date settings");
                break;
            case 4:
                System.out.println("Stopwatch");
                break;
            case 5:
                System.out.println("Countdown timer");
                break;
            case 6:
                System.out.println("Auto update of date and time");
                break;
            default:
                clock();
        }
    }

    public static void profiles(){

        System.out.println("Profiles");
        userInput();
    }

    public static void simServices(){

        System.out.println("SIM services");
        userInput();
    }










}