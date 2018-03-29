package com.javapractice.examples;

import java.util.Scanner;

enum Day
{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY;
}
 
public class EnumExample19 {

    Day day;
 
    // Constructor
    public EnumExample19(Day day)
    {
        this.day = day;
    }
 
    // Prints a line about Day using switch
    public void dayIsLike()
    {
        switch (day)
        {
        case MONDAY:
            System.out.println("Mondays are bad.");
            break;
        case FRIDAY:
            System.out.println("Fridays are better.");
            break;
        case SATURDAY:
        case SUNDAY:
            System.out.println("Weekends are best.");
            break;
        default:
            System.out.println("Midweek days are so-so.");
            break;
        }	
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter week name...");
        String str = sc.next().toUpperCase();
        EnumExample19 e1 = new EnumExample19(Day.valueOf(str));
        e1.dayIsLike();
    }
}