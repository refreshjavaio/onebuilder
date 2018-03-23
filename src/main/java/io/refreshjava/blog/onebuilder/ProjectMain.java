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

    public static final class Builder {
        // Required
        private final String projectID;
        private final String projectName;
        // Optional
        private String projectManager;
        private LocalDate projectStartDate;
        private LocalDate plannedFinishDate;
        private LocalDate committedFinishDate;
        private long projectDuration;
        private Double totalBudget;
        private Double earnedValue;
        private Double plannedValue;

        // Contructor with required fields
        public Builder(String projectID, String projectName) {
            this.projectID = projectID;
            this.projectName = projectName;
            projectManager = "tbd";
            projectStartDate = LocalDate.now();
        }
        public Builder projectManager(String value) {
            projectManager = value;
            return this;
        }
        public Builder projectStartDate(LocalDate date) {
            this.projectStartDate = date;
            return this;
        }
        // Builder method with multiple parameters
        public Builder financial(Double budget, Double ev, Double pv) {
            totalBudget = budget;
            earnedValue = ev;
            plannedValue = pv;
            return this;
        }
        public ProjectMain build() {
            return new ProjectMain(this);
        }
    }

    public ProjectMain(Builder builder) {

        this.projectID = builder.projectID;
        this.projectName = builder.projectName;
        this.projectManager = builder.projectManager;
        this.projectStartDate = builder.projectStartDate;
        this.plannedFinishDate = builder.plannedFinishDate;
        this.committedFinishDate = builder.committedFinishDate;
        this.projectDuration = builder.projectDuration;
        this.totalBudget = builder.totalBudget;
        this.earnedValue = builder.earnedValue;
        this.plannedValue = builder.plannedValue;
    }

    public String getProjectName() {
        return projectName;
    }

    public static void main(final String[] args) {
        Builder builder = new Builder("001", "Project A").projectManager("John")
            .financial(15000.0, 0.0, 10000.0);
        ProjectMain projectMain = builder.build();
        System.out.println("Project: " + projectMain.getProjectName());
    }
}
