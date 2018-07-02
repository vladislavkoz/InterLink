package institution;

import person.Student;
import person.consciousness.Knowledge;

import java.util.List;

public class University implements KnowledgeSource {

    private String name;
    private List<Student> universityStudents;
    private static Knowledge knowledgePortion = new Knowledge(SkillsLevels.LOW.getLevel(),SkillsLevels.HIGHT.getLevel());
    private Period period;


    public University(String name, List<Student> universityStudents, Knowledge knowledgePortion, Period period) {
        this.name = name;
        this.universityStudents = universityStudents;
        this.period = period;
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


    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    //    public int getAverageScore(){
//        Optional<Integer> averageScore = universityStudents.stream()
//                .map(student -> student.getKnowledge().getLevel())
//                .reduce((level1, level2)-> level1 + level2);
//        return averageScore.map(integer -> integer / universityStudents.size()).orElse(0);
//    }
}
