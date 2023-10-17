package org.projects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.projects.sample.DateSorter;

import java.time.LocalDate;
import java.util.List;

class AppTest {
    private final DateSorter dateSorter;

    public AppTest() {
        this.dateSorter = new DateSorter();
    }

    @Test
    void testApp() {
        List<LocalDate> dates = List.of(
                LocalDate.of(2004, 7, 1),
                LocalDate.of(2005, 1, 2),
                LocalDate.of(2007, 1, 1),
                LocalDate.of(2032, 5, 3)
        );

        List<LocalDate> sortedDates = List.of(
                LocalDate.of(2005, 1, 2),
                LocalDate.of(2007, 1, 1),
                LocalDate.of(2032, 5, 3),
                LocalDate.of(2004, 7, 1)
        );

        Assertions.assertEquals(sortedDates, dateSorter.sortDates(dates));
    }
}
