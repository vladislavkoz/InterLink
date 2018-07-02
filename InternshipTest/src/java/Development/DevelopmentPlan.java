package Development;

import institution.KnowledgeSource;
import person.Student;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class DevelopmentPlan {

    private List<DevelopmentEntity> developments = new ArrayList<>();

    public void executeDevelopmentPlan(Student student,LocalDate endOfPlan  ){
        //todo
        while(!LocalDate.now().isEqual(endOfPlan)){
            for (DevelopmentEntity developmentEntity : developments) {
                if (developmentEntity.getPeriod().)
            }
        }
    }

}
