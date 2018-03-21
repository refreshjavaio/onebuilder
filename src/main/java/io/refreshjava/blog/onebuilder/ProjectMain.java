package io.refreshjava.blog.onebuilder;

import java.time.LocalDate;

/**
 * Example class for refreshJava.io blog.
 */
public class ProjectMain {

    private final String projectID;
    private final String projectName;
    private final String projectManager;
    private final LocalDate projectStartDate;
    private final LocalDate plannedFinishDate;
    private final LocalDate committedFinishDate;
    private final long projectDuration;
    private final Double totalBudget;
    private final Double earnedValue;
    private final Double plannedValue;

    public ProjectMain(final String projectID, final String projectName, final String projectManager, LocalDate projectStartDate,
        LocalDate plannedFinishDate, LocalDate committedFinishDate, long projectDuration, Double totalBudget,
        Double earnedValue, Double plannedValue) {
        this.projectID = projectID;
        this.projectName = projectName;
        this.projectManager = projectManager;
        this.projectStartDate = projectStartDate;
        this.plannedFinishDate = plannedFinishDate;
        this.committedFinishDate = committedFinishDate;
        this.projectDuration = projectDuration;
        this.totalBudget = totalBudget;
        this.earnedValue = earnedValue;
        this.plannedValue = plannedValue;
    }

    /**
     * Main method.
     * @param args
     */
    public static void main(final String[] args) {
        System.out.println("Test");
    }
}
