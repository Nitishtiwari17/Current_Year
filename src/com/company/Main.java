package com.company;
import java.time.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Year;

public class Main {

    public static void main(String[] args) {

        Year yr=Year.now();
        System.out.println("\nCurrent Year:" + yr);
        boolean isLeap=yr.isLeap();
        System.out.println("Is current year Leap year?"+isLeap);
        int Length=yr.length();
        System.out.println("Length of the year:"+Length+"days\n");
    }
	// write your code here
    }

