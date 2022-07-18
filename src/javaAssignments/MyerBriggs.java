package javaAssignments;

import java.util.Scanner;

public class MyerBriggs {

    static Scanner input = new Scanner(System.in);
    private static int resultA1;
    private static int resultB1;
    private static int resultA2;
    private static int resultB2;
    private static int resultA3;
    private static int resultB3;
    private static int resultA4;
    private static int resultB4;


    public static void main(String[] args) {
        System.out.println("Myers Briggs Test: Select either Options A or B");
        firstQuestions();
        secondQuestions();
        thirdQuestions();
    }

    public static void firstQuestions() {
        System.out.print("A- expand energy, enjoy groups");
        System.out.print("  ***  ");
        System.out.println("B- conserve energy, enjoy one-on-one");
        String firstResponse = input.next();
        getChoices(firstResponse);

        System.out.print("A - more outgoing, think out loud");
        System.out.print("   ***   ");
        System.out.println("B - more reserved, think to yourself");
        String secondResponse = input.next();
        getChoices(secondResponse);

        System.out.print("A - seek many tasks, public activities, interaction with others");
        System.out.print("   ***   ");
        System.out.println("B - seek private, solitary activities with quiet to concentrate");
        String thirdResponse = input.next();
        getChoices(thirdResponse);


        System.out.print("A - external, communicative, express yourself");
        System.out.print("   ***   ");
        System.out.println("B - internal, reticent, keep to yourself");
        String fourthResponse = input.next();
        getChoices(fourthResponse);


        System.out.print("A - active, initiate");
        System.out.print("   ***   ");
        System.out.println("B - reflective, deliberate");
        String fifthResponse = input.next();
        getChoices(fifthResponse);

    }

    public static void getChoices(String firstResponse) {
        if ("A".equals(firstResponse)) {
            resultA1++;
        }
        resultB1++;
    }

    public static String getFirstResult() {
        String firstResult = "";
        if (resultA1 > resultB1)
            firstResult = "E";
        else
            firstResult = "I";

        return firstResult;
    }

    public static void secondQuestions() {
        System.out.print("A - interpret literally");
        System.out.print("   ***   ");
        System.out.println("B - look for meaning and possibilities");
        String firstResponse = input.next();
        getChoices2(firstResponse);

        System.out.print("A - practical, realistic, experiential");
        System.out.print("   ***   ");
        System.out.println("B - imaginative, innovative, theoretical");
        String secondResponse = input.next();
        getChoices2(secondResponse);

        System.out.print("A - standard, usual, conventional");
        System.out.print("   ***   ");
        System.out.println("B - different, novel, unique");
        String thirdResponse = input.next();
        getChoices2(thirdResponse);

        System.out.print("A - focus on here and now");
        System.out.print("   ***   ");
        System.out.println("B - look to the future, global perspective, big picture");
        String forthResponse = input.next();
        getChoices2(forthResponse);

        System.out.print("A - facts, things, \"what is\"");
        System.out.print("   ***   ");
        System.out.println("B - ideas, dreams, \"what could be\", philosophical");
        String fifthResponse = input.next();
        getChoices2(fifthResponse);
    }

    public static void getChoices2(String secondResponse) {
        if ("A".equals(secondResponse)) {
            resultA2++;
        }
        resultB2++;
    }

    public static String getSecondResult() {
        String secondResult = "";
        if (resultA2 > resultB2)
            secondResult = "S";
        else
            secondResult = "N";

        return secondResult;
    }


    public static void thirdQuestions() {
        System.out.println("Select option A or B");
        System.out.print("A - logical, thinking, questioning");
        System.out.print("   ***   ");
        System.out.println("B - empathetic, feeling, accommodating");
        String firstResponse = input.next();
        getChoices3(firstResponse);

        System.out.print("A - candid, straight forward, frank");
        System.out.print("   ***   ");
        System.out.println("B - tactful, kind, encouraging");
        String secondResponse = input.next();
        getChoices3(secondResponse);

        System.out.print("A - firm, tend to criticize, hold the line");
        System.out.print("   ***   ");
        System.out.println("B - gentle, tend to appreciate, conciliate");
        String thirdResponse = input.next();
        getChoices3(thirdResponse);

        System.out.print("A - tough-minded, just");
        System.out.print("   ***   ");
        System.out.println("B - tender-hearted, merciful");
        String forthResponse = input.next();
        getChoices3(forthResponse);

        System.out.print("A - matter of fact, issue-oriented");
        System.out.print("   ***   ");
        System.out.println("B - sensitive, people-oriented, compassionate");
        String fifthResponse = input.next();
        getChoices3(fifthResponse);
    }

    public static void getChoices3(String thirdResponse) {
        if ("A".equals(thirdResponse)) {
            resultA3++;
        }
        resultB3++;
    }

    public static String getThirdResult() {
        String thirdResult = "";
        if (resultA3 > resultB3)
            thirdResult = "T";
        else
            thirdResult = "F";

        return thirdResult;
    }



    public static void fourthQuestions() {
        System.out.println("Select option A or B");
        System.out.print("A - organized, orderly");
        System.out.print("   ***   ");
        System.out.println("B - flexible, adaptable");
        String choice = input.next();
        getOptions4(choice);

        System.out.print("A - plan, schedule");
        System.out.print("   ***   ");
        System.out.println("B - unplanned, spontaneous");
        String choice2 = input.next();
        getOptions4(choice2);

    }

    public static void getOptions4(String forthResponse) {
        if ("A".equals(forthResponse)) {
            resultA4++;
        }
        resultB4++;
    }

    public static String getForthResult() {
        String forthResult = "";
        if (resultA4 > resultB4)
            forthResult = "J";
        else
            forthResult = "P";

        return forthResult;
    }



}


