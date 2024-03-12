package com.javacode.qspider_assignment.day6;

public class FloatExamCriteria {
    public static void main(String[] args) {
        float passingCriteria = 35.5f;
        float passedAverage = 17.82f;
        float failedAverage = 63.14f;
        float unattempted = 14.04f;
        float higherEducation = 28.96f;
        System.out.println("For Passing in Gate exam, we need to have minimum of " + passingCriteria + " % score.");
        System.out.println("Average passing student in Gate exam is: " + passedAverage + " %");
        System.out.println("Average failing student in Gate exam is: " + failedAverage + " %");
        System.out.println("percentage of student who dont even attempt Gate exam is: " + unattempted + " %");
        System.out.println("Percentage of student who pursue higher education after passing Gate exam: " + higherEducation + " %");
    }
}
