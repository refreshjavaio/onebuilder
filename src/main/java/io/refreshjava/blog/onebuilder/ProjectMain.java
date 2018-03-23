package io.refreshjava.blog.onebuilder;

import java.time.LocalDate;

public final class ProjectMain {

    private final String projectID;
    private final String projectName;
    private final String projectManager;
    private final LocalDate projectStartDate;
    private final LocalDate plannedFinishDate;
    private LocalDate committedFinishDate;
    private long projectDuration;
    private Double totalBudget;
    private Double earnedValue;
    private Double plannedValue;

    public ProjectMain(String projectID, String projectName, String projectManager,
        LocalDate projectStartDate, LocalDate plannedFinishDate,
        LocalDate committedFinishDate, long projectDuration, Double totalBudget,
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

    public String getProjectID() {
        return projectID;
    }

    public String getProjectName() {
        return projectName;
    }

    public static void main(final String[] args) {
        ProjectMain projectMain = new ProjectMain("1", "Project A", null, LocalDate.now(),
            null, null, 0L, null, null, null);
        System.out.println("Test: " + projectMain.getProjectName());
    }
}
