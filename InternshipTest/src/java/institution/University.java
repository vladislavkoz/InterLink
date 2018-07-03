package institution;

import Development.ScheduleRule;
import person.Student;
import person.consciousness.Knowledge;

import java.util.List;
import java.util.Optional;

public class University implements KnowledgeSource {

    private String name;
    private List<Student> universityStudents;
    private static Knowledge knowledgePortion = new Knowledge(SkillsLevels.LOW.getLevel(),SkillsLevels.HIGHT.getLevel());
    private ScheduleRule schedule;

    public University(String name, List<Student> universityStudents, ScheduleRule schedule) {
        this.name = name;
        this.universityStudents = universityStudents;
        this.schedule = schedule;
    }

    public University(String name, ScheduleRule schedule) {
        this.name = name;
        this.schedule = schedule;
    }

    @Override
    public ScheduleRule getScheduleRule() {
        return schedule;
    }

    @Override
    public void takeKnowledge(Student student) {
        if (universityStudents.contains(student)){
            student.getKnowledge(this.knowledgePortion);
        }
    }

    public void setStudents(List<Student> students) {
        this.universityStudents = students;
    }

    public void addStudent(Student student) {
        universityStudents.add(student);
    }

    public void addStudents(List<Student> students){
        students.forEach(student -> universityStudents.add(student));
    }

    public List<Student> getStudents(){
        return universityStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getUniversityStudents() {
        return universityStudents;
    }

    public void setUniversityStudents(List<Student> universityStudents) {
        this.universityStudents = universityStudents;
    }

    public static Knowledge getKnowledgePortion() {
        return knowledgePortion;
    }

    public static void setKnowledgePortion(Knowledge knowledgePortion) {
        University.knowledgePortion = knowledgePortion;
    }

    public void setSchedule(ScheduleRule schedule) {
        this.schedule = schedule;
    }

    public double getAverageScore(){
        Optional<Double> averageScore = universityStudents.stream()
                .map(student -> student.getKnowledge().getKnowledgeLevel())
                .reduce((level1, level2)-> level1 + level2);
        return averageScore.map(integer -> integer / universityStudents.size()).orElse((double) 0);
    }
}
