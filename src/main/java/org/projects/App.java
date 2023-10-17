package org.projects;

import org.projects.sample.DateSorter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        DateSorter dateSorter = new DateSorter();

        List<LocalDate> dates = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number of dates: ");

            int numberOfDates = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter the dates in the format YYYY-MM-DD: ");

            for (int i = 0; i < numberOfDates; i++) {
                String date = scanner.nextLine();
                dates.add(LocalDate.parse(date));
            }
        }

        System.out.println("The sorted dates are: ");
        System.out.println(dateSorter.sortDates(dates));
    }
}
