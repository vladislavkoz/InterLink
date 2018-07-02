package person;

import person.consciousness.Knowledge;

public class Student {
    private String name;
    private Knowledge knowledge;
    private double trainingFactor;

    public Student() {
    }

    public Student(String name, Knowledge knowledge, double trainingFactor) {
        this.name = name;
        this.knowledge = knowledge;
        this.trainingFactor = trainingFactor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }

    public Knowledge getKnowledge() {
        return knowledge;
    }

    public double getTrainingFactor() {
        return trainingFactor;
    }

    public void setTrainingFactor(double trainingFactor) {
        this.trainingFactor = trainingFactor;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", knowledge=" + knowledge +
                '}';
    }
}
