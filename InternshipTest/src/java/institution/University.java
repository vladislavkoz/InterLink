package institution;

import person.Student;
import person.consciousness.Knowledge;

import java.util.List;
import java.util.Optional;

public class University extends InstitutionEntity {

    private String name;
    private List<Student> universityStudents;
    private Knowledge knowledgePortion;

    public University(String name) {
        this.name = name;
        this.knowledgePortion = new Knowledge(SkillsLevels.LOW.getLevel(),SkillsLevels.HIGHT.getLevel());
    }

    public void teach(Student student){
        super.teach(student,knowledgePortion);
    }

    public double getAverageScore(){
        Optional<Double> averageScore = universityStudents.stream()
                .map(student -> student.study().getKnowledgeLevel())
                .reduce((level1, level2)-> level1 + level2);
        return averageScore.map(integer -> integer / universityStudents.size()).orElse((double) 0);
    }
}
