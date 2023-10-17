package org.projects.sample;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class DateSorter {

    /**
     * The implementation of this method should sort dates.
     * The output should be in the following order:
     * Dates with an 'r' in the month,
     * sorted ascending (first to last),
     * then dates without an 'r' in the month,
     * sorted descending (last to first).
     * For example, October dates would come before May dates,
     * because October has an 'r' in it.
     * thus: (2004-07-01, 2005-01-02, 2007-01-01, 2032-05-03)
     * would sort to
     * (2005-01-02, 2007-01-01, 2032-05-03, 2004-07-01)
     *
     * @param unsortedDates - an unsorted list of dates
     * @return the collection of dates now sorted as per the spec
     */
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        // The key is a boolean, true if the month name contains 'r', false otherwise
        Map<Boolean, List<LocalDate>> datesPartitionedByR = unsortedDates.stream()
                .collect(Collectors.partitioningBy(DateSorter::isMonthNameContainingR));

        // Sort the dates with 'r' in the month in ascending order
        List<LocalDate> datesWithRInMonth = datesPartitionedByR.get(true);
        Collections.sort(datesWithRInMonth);

        // Sort the dates without 'r' in the month in descending order
        List<LocalDate> datesWithoutRInMonth = datesPartitionedByR.get(false);
        Collections.sort(datesWithoutRInMonth, Collections.reverseOrder());

        // Concatenate the two lists and return the result
        return Stream.of(datesWithRInMonth, datesWithoutRInMonth)
                .flatMap(Collection::stream)
                .toList();
    }

    private static boolean isMonthNameContainingR(LocalDate date) {
        return date.getMonth()
                .toString()
                .matches(".*[Rr].*");
    }
}